package com.xandersu.myconcurrency.immutable_object06.threadlocal;

/**
 * @Author: suxun
 * @Date: 2018/12/17 21:18
 * @Description:
 */
public class MyRequestHolder {

    private static final ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void add(long id) {
        threadLocal.set(id);
    }

    public static Long getId() {
        return threadLocal.get();
    }

    public static void remove() {
        threadLocal.remove();
    }
}
