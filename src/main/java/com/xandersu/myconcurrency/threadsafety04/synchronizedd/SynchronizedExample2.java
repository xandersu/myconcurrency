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
public class SynchronizedExample2 {

    //修饰类,作用对象是这个类的所有对象
    public static void test1(int j) {
        synchronized (SynchronizedExample2.class) {
            for (int i = 0; i < 10; i++) {
                log.info("test1-i={},j={}", i, j);
            }
        }
    }

    //修饰静态方法,作用对象是这个类的所有对象
    public synchronized static void test2(int j) {
        for (int i = 0; i < 10; i++) {
            log.info("test2-i={},j={}", i, j);
        }
    }

    public static void main(String[] args) {
        SynchronizedExample2 synchronizedExample1 = new SynchronizedExample2();
        SynchronizedExample2 synchronizedExample2 = new SynchronizedExample2();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> synchronizedExample1.test2(1));
        executorService.execute(() -> synchronizedExample2.test2(2));
    }
}
