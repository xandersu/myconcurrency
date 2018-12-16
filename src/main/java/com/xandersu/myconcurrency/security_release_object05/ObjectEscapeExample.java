package com.xandersu.myconcurrency.security_release_object05;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: suxun
 * @Date: 2018/12/16 20:02
 * @Description: 对象逸出
 */
@Slf4j
public class ObjectEscapeExample {

    private int thisCanBeEscape = 0;

    public ObjectEscapeExample() {
        new InnerClass();
    }

    private class InnerClass {
        public InnerClass() {
            log.info("{}", ObjectEscapeExample.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new ObjectEscapeExample();
    }
}
