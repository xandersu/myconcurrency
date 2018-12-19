package com.xandersu.myconcurrency.threadsafety04.atomic;

import com.xandersu.myconcurrency.annotation.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: suxun
 * @Date: 2018/12/16 17:15
 * @Description:
 */
@Slf4j
@ThreadSafe
public class CountExample2AtomicLong {
    //请求总数
    private static int clientTotal = 5000;
    //同时并发执行的线程数
    private static int threadTotal = 200;

    private static AtomicLong count = new AtomicLong(0);

    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadTotal);
        //计数器闭锁
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
        for (int i = 0; i < clientTotal; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                } catch (Exception e) {
                    log.error("exception", e);
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
       log.info("count:{}",count.get());
    }

    private static void add() {
        count.incrementAndGet();
        //count.getAndIncrement();
    }
}