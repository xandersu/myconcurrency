package com.xandersu.myconcurrency.threadpool09;

/**
 * @Author: suxun
 * @Date: 2018/12/23 16:37
 * @Description: 线程池
 * new Thread 弊端
 * 每次new 新建对象，性能差
 * 线程缺乏统一管理，可能无限制的新建线程，相互竞争，又可能占用过多资源导致死机或者oom
 * 缺少更多功能，更多执行、定期执行、线程中断
 * ·
 * 线程池好处：
 * 重用存在的线程，减少对象的创建、消亡的开销，性能佳
 * 可有效控制最大并发线程数，提高系统资源利用率，同时可以避免过多的资源竞争，避免阻塞
 * 提供定时执行，定期执行，单线程，并发数控制等功能
 * ·
 * ThreadPoolExecutor 线程池
 * corePoolSize:核心线程数量
 * maximumPoolSize:线程最大线程数
 * workQueue:阻塞队列，存储等待执行的任务，很重要，会对线程池运行过程产生重大影响
 * keepAliveTime：线程没有任务执行时最多保持多久时间停止
 * unit：keepAliveTime的时间单位
 * threadFactory：线程工厂
 * rejectHandler：当拒绝处理任务时的策略
 * execute()：提交任务，交给线程池执行
 * submit():提交任务，能够返回执行的结果 execute+Future
 * shutdown():关闭线程池，等待任务都执行完
 * shutDownNow():关闭线程池，不等待任务都执行完
 * getTaskCount():线程池已执行和未执行的任务总数
 * getCompletedTaskCount():已完成的任务数量
 * getPoolSize():线程池当前的线程数量
 * getActiveCount():当前线程池中正在执行任务的线程数量
 * Exe
 */
public interface MyThreadPool {
}
