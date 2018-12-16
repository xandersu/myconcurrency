package com.xandersu.myconcurrency.threadsafety04.synchronizedd;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: suxun
 * @Date: 2018/12/16 18:45
 * @Description:
 */
@Slf4j
public class SynchronizedExample1 {

    //修饰代码块
    public void test1(int j) {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                log.info("test1-i={},j={}", i, j);
            }
        }
    }

    //修饰方法
    //如果有子类继承该类，子类调用test2不包含synchronized
    //原因是synchronized不是方法声明的一部分
    public synchronized void test2(int j) {
        for (int i = 0; i < 10; i++) {
            log.info("test1-i={},j={}", i, j);
        }
    }

    public static void main(String[] args) {
        SynchronizedExample1 synchronizedExample1 = new SynchronizedExample1();
        SynchronizedExample1 synchronizedExample2 = new SynchronizedExample1();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> synchronizedExample1.test1(1));
        executorService.execute(() -> synchronizedExample2.test1(2));
    }
}
