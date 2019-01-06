package com.xandersu.myconcurrency.multi_threaded_concurrent_expanse10;

/**
 * @Author: suxun
 * @Date: 2019/1/6 14:46
 * @Description: 多线程并发拓展10
 * ····
 * 死锁：
 * 4个必要条件
 * 1、互斥条件
 * 2、请求和保持条件
 * 3、不剥夺条件
 * 4、环路等待条件
 * ····
 * 多线程并发最佳实践
 * 1、使用本地变量
 * 2、使用不可变类
 * 3、最小化锁的作用域范围 s=1/(1-a+a/n)
 * 4、使用线程池wxecutor,为不直接使用new Thread
 * 5、宁可使用同步也不要使用线程的wait和notify
 * 6、使用Blocking Queue实现生产消费模式
 * 7、使用并发集合而不是加了锁的同步集合
 * 8、使用信号量Semaphore创建有届访问
 * 9、宁可使用同步代码块，也不使用同步的方法
 * 10、避免使用静态变量
 * ····
 * Spring与线程安全
 * Spring bean:singleton/prototype
 * 无状态对象（自身状态，dto，vo，service，dao）
 *
 */
public interface MultiThreadedConcurrentExpansion {
}
