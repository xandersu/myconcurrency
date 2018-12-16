package com.xandersu.myconcurrency.security_release_object05;

import com.xandersu.myconcurrency.annotation.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: suxun
 * @Date: 2018/12/16 19:58
 * @Description:
 */
@Slf4j
@NotThreadSafe
public class UnsafePublishExample {

    private String[] states = {"a", "b", "c"};

    public String[] getStates() {
        return states;
    }

    public static void main(String[] args) {
        UnsafePublishExample unsafePublishExample = new UnsafePublishExample();
        log.info("first {}", Arrays.toString(unsafePublishExample.getStates()));
        unsafePublishExample.getStates()[0] = "d";
        log.info("first {}", Arrays.toString(unsafePublishExample.getStates()));
    }
}
