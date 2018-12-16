package com.xandersu.myconcurrency.security_release_object05.singleton;


import com.xandersu.myconcurrency.annotation.NotThreadSafe;

/**
 * @Author: suxun
 * @Date: 2018/12/16 20:19
 * @Description: 单例模式-懒汉模式
 */
@NotThreadSafe
public class SingletonExample1 {
    //私有化构造函数
    private SingletonExample1() {
    }
    //单例对象
    private static SingletonExample1 instance = null;
    //静态的工厂方法
    public static  SingletonExample1 getInstance() {
        if (instance == null) {
            instance = new SingletonExample1();
        }
        return instance;
    }
}
