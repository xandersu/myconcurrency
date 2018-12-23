package com.xandersu.myconcurrency.juc_aqs;

/**
 * @Author: suxun
 * @Date: 2018/12/19 21:16
 * @Description: AbstractQueuedSynchronizer-AQS
 * 使用Node实现FIFO队列，可以用于构建锁或者其他同步装置的基础框架
 * 使用了一个int 表示状态
 * 使用方法是继承
 *子类通过继承并通过实现它的方法管理其状态「acquire和release」的方法操纵状态
 * 可以同时实现排它锁和共享锁模式（独占，共享）
 * ··
 * AQS同步组件
 * CountDownLatch
 * Semaphore
 * cyclicBarrier
 * ReentrantLock
 * Condition
 * FutureTask
 * ========================================================================
 * ReentrantLock(可重入锁)和synchronized区别
 * 可重入性：都是可重入，区别不大，同一个线程进入锁，锁计数器加一，当计数器为零时才能释放锁
 * 锁的实现：JDK，JVM
 * 性能的区别：区别不大，官方推荐synchronized
 * 功能区别：synchronized编译器加锁和释放锁，ReentrantLock代码控制，finally里释放；ReentrantLock力度细
 * ·
 * ReentrantLock独有功能：
 * 可制定时公平锁还是非公平锁
 * 提供了一个Condition类，可以分组唤醒需要唤醒的线程
 * 提供能够中断等待锁的线程的机制，lock.lockInterruptibly()
 * ReentrantLock CAS 实现加锁，避免线程进入内核态的阻塞状态
 * ``
 * StampedLock 性能好 对象层面
 *
 */
public interface JUC_AQS {
}
