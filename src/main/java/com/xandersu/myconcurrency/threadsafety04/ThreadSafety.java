package com.xandersu.myconcurrency.threadsafety04;

/**
 * @Author: suxun
 * @Date: 2018/12/16 17:25
 * @Description: 线程安全性
 * 定义：当多个线程访问某一个类时，不管运行时环境采用何种调度方式
 * 或者这些进程将如何交替执行，并且在主调代码中不需要任何额外的同步或协同，
 * 这个类都能表现出正确的行为，那么就称这个类是线程安全的。
 * 体现在三个方面：
 * 原子性：提供了互斥访问，同一个时刻只能有一个线程来对他操作
 * 可见性：一个线程对主内存的修改可以及时的被其他线程观察到
 * 有序性：一个线程观察其他线程中的指令执行顺序，由于指令重排序的存在，该观察结果一般杂乱无序
 * · C4-P1-2
 * 原子性-Atomic包
 * AtomicXXX:CAS / Unsafe.compareAndSwapInt
 * AtomicLong / LongAdder
 * CAS:死循环，竞争不激烈情况下修改成功率很高；并发度高情况下竞争激烈修改成功率低，大量失败情况下这些原子操作会进行多次循环尝试，影响性能。
 * 对基本类型的long和double的jvm允许将64位的读写操作拆成两个32位的操作。
 * LongAdder：将热点数据分离，将long内部核心数据分离成一个数组，每个线程访问时，通过哈希等算法映射到其中一个数字进行计数，而最终结果是这个数据求和累加。
 * 其中热点数据value分离成多个单元的cell，每个cell独自维护内部的值。当前对象的实际值由所有cell累计合成。
 * 热点分离，提高并行度。在AtomicLong基础上将单点的竞争压力分散到各个单点上，低并发下对base直接更新，保持了跟AtomicLong效率基本一致了；高并发下通过分散提高性能。
 * 缺点：统计时，如果有并发更新，可能导致统计的数据有些误差，实际使用中高并发下使用LongAdder。线程竞争低情况下，准确的数据，用AtomicLong。
 * ·
 * AtomicReference、AtomicReferenceFieldUpdater（用的少）
 * ·
 * AtomicStampReference: 解决CAS的ABA问题
 * ABA问题：在cas操作是其他线程将A改成了B又改成了A，本线程使用期望值A进行比较时发现是A就进行交换操作，实际上该值已经被其他线程更新过。
 * 解决思路：每次变量更新将版本号加一
 * ·
 * AtomicLongArray:维护的是一个数组，可以选择性的更新某一个索引对应的值，原子性
 * `
 * 原子性-锁
 * synchronized:依赖JVM，在这个关键字作用对象的作用范围内，都是同一时刻只有一个线程可以操作的。
 * Lock：依赖特殊的CPU指令，代码实现，ReentrantLock
 * `
 * synchronized
 * 关键字，同步锁，修饰的对象主要有四种：
 * 1、修饰代码块：大括号括起来的代码，作用于调用的对象。被修饰的代码叫同步语句块，作用范围大括号括起来的代码，作用的对象是调用这个代码块的对象
 * 2、修饰方法：整个方法，作用于调用的对象。被修饰的方法成为同步方法，作用范围是整个方法，作用的对象是调用这个方法的对象
 * 3、修饰一个静态方法：整个静态方法，作用于所有对象。
 * 4、修饰类：括号括起来的部分，作用于所有对象。范围是synchronized括号括起来的，作用对象这个类的所有对象
 * ·
 * 原子性-对比
 * synchronized：不可中断锁，适合竞争不激烈，可读性好
 * Lock：可中断锁，多样化同步，竞争激烈时能保证常态
 * AtomicL：竞争激烈时能维持常态，比lock性能好；只能同步一个值
 */
public interface ThreadSafety {
}
