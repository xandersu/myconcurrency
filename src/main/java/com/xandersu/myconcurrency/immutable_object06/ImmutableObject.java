package com.xandersu.myconcurrency.immutable_object06;

/**
 * @Author: suxun
 * @Date: 2018/12/17 20:30
 * @Description: 不可变对象
 * 不可变对象满足的条件：
 * 1、对象创建以后其状态就不能改变
 * 2、对象所有域都是final类型
 * 3、对象是正确创建的(在对象创建期间，this引用没有逸出)
 * ·
 * final修饰类，方法和变量
 * 1、修饰类：不能被继承；final类的所有方法都会被隐似的修饰为final；谨慎选择；
 * 2、修饰方法：1、锁定方法不能被继承类修改；2、效率；(private方法隐似final方法)
 * 3、变量：基本数据类型(初始化后不能修改)、引用类型变量(初始化后不能被指向另外一个对象)
 * ·
 * Collections.unmodifiableXXX:Collection、List、Set、Map... 一旦初始化后，值不允许改变
 * Guava:ImmutableXXX:Collection、List、Set、Map...
 * ·
 * Ad-hoc 线程封闭：程序控制实现，最糟糕，忽略
 * 堆栈封闭：局部变量，无并发问题
 * ThreadLocal 线程封闭：很好的封闭办法。jdbc connection对象 内部有map
 * ·
 * 线程不安全的写法
 * StringBuffer
 * joda-time DateTimeFormatter
 * 先检查再执行 if(condition(a)){handle(a);}
 * `
 * 线程安全-同步容器
 * ArrayList -> Vector,Stack
 * HashMap -> HashTable(key/value not null)
 * Collections.synchronizedXXX(List,Set,Map)
 * `
 * 并发容器J.U.C
 * ArrayList -> CopyOnWriteArrayList
 * -线程安全，写操作时复制；先拷贝一份，写完后指向新数组；add操作有锁；拷贝引发GC，速度慢；不能用于实时读；
 * -读写分离；最终一致性；使用时另外开辟空间；读在原数组读，不加锁，写操作加锁；
 * HashSet\TreeSet -> CopyOnWriteArraySet\ConcurrentSkipListSet
 * CopyOnWriteArraySet 复制整个数组，add，set开销大；迭代器不支持可见的remove操作；迭代器遍历很快，不会与其他线程冲突
 * ConcurrentSkipListSet jdk6+  支持自然排序，构造时只定义比较器；xxxAll不能保证以原子方式执行；不允许null；
 * HashMap/TreeMap -> ConcurrentHashMap/ConcurrentSkipListMap
 * ConcurrentHashMap 不允许null
 * ConcurrentSkipListMap  key有序、支持更高的并发，存取时间跟线程数无关
 * ==================================================================================================
 * 安全共享对象策略-总结
 * 线程限制：一个被线程限制的对象，由线程独占，并且只能被占有它的线程修改
 * 共享只读：一个共享只读的对象，在没有额外同步的情况下，可以被多个线程并发访问，但是任何线程都不能修改他
 * 线程安全对象：一个线程安全的对象或者容器，在内部通过同步机制来保证线程安全，所以其他线程无需额外的同步就可以通过公共接口随意访问
 * 被守护的对象：被守护的对象只能通过获取特定的锁来访问
 *
 */
public interface ImmutableObject {
}
