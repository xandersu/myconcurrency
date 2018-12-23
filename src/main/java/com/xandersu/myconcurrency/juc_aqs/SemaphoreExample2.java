package com.xandersu.myconcurrency.juc_aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Author: suxun
 * @Date: 2018/12/23 12:23
 * @Description:
 */
@Slf4j
public class SemaphoreExample2 {
    private static final int threadCount = 200;

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < threadCount; i++) {
            final int threadNum = i;
            executorService.execute(() -> {
                try {
                    semaphore.acquire(3);//获取多个许可
                    test(threadNum);
                    semaphore.release(3);//释放多个许可
                } catch (Exception e) {
                    log.error("error", e);
                } finally {

                }
            });
        }

        log.info("finish");
        executorService.shutdown();
    }

    private static void test(int threadNum) throws Exception {
        log.info("threadNum={}", threadNum);
        Thread.sleep(1000);
    }
}
