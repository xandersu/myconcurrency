package com.xandersu.myconcurrency.juc_expand08;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @Author: suxun
 * @Date: 2018/12/23 16:08
 * @Description:
 */
@Slf4j
public class FutureExample1 {

    static class MyCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            log.info("do something in callable");
            Thread.sleep(5000);
            return "Done";
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(new MyCallable());
        log.info("so something in main");
        Thread.sleep(1000);
        String result = future.get();
        log.info("result={}", result);
    }
}
