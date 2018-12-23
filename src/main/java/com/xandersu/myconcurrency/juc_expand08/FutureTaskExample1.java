package com.xandersu.myconcurrency.juc_expand08;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @Author: suxun
 * @Date: 2018/12/23 16:08
 * @Description:
 */
@Slf4j
public class FutureTaskExample1 {

    public static void main(String[] args) throws Exception {
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            log.info("do something in callable");
            Thread.sleep(5000);
            return "Done";
        });
        new Thread(futureTask).start();
        log.info("so something in main");
        Thread.sleep(1000);
        String result = futureTask.get();
        log.info("result={}", result);
    }
}
