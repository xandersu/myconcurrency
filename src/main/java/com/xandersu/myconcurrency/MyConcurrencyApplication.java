package com.xandersu.myconcurrency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Java并发编程入门与高并发面试
 * 基本概念
 * 并发：同时拥有两个或者多个线程，如果程序在单核处理器上运行，多个线程交替地换入或者换出内存，这些线程是同时"存在"的，
 * 每个线程都处于执行过程中的某个状态，如果运行在多核处理器上，此时，程序中的每个线程都将分配到一个处理器核上，因此可以同时运行。
 * 高并发： high concurrency 是互联网分布式系统架构设计中必须要考虑的元素之一，通常指，通过设计
 * 保证系统能够同时并行处理很多请求。
 * 并发：多个线程操作相同资源，保证线程安全，合理使用资源
 * 高并发：服务能够同时处理很多请求没提高程序性能
 */
@SpringBootApplication
public class MyConcurrencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyConcurrencyApplication.class, args);
    }
}
