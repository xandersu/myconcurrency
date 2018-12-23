package com.xandersu.myconcurrency.juc_aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author: suxun
 * @Date: 2018/12/23 12:23
 * @Description:
 */
@Slf4j
public class CyclicBarrierExample3 {
    private static final int threadCount = 200;
    public static CyclicBarrier barrier = new CyclicBarrier(5,()->{
        log.info("callback is running");
    });

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            final int threadNum = i;
            executorService.execute(() -> {
                try {
                    test(threadNum);
                } catch (Exception e) {
                    log.error("error", e);
                }
            });
        }

        log.info("finish");
        executorService.shutdown();
    }

    private static void test(int threadNum) throws Exception {
        Thread.sleep(1000);
        log.info("ready={}", threadNum);
        try {
            barrier.await();
        } catch (Exception e) {
            log.error("error", e);
        }
        log.info("continue={}", threadNum);

    }
}
