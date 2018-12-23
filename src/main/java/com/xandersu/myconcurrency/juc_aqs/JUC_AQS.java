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
 *
 */
public interface JUC_AQS {
}
