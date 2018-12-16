package com.xandersu.myconcurrency.security_release_object05.singleton;


import com.xandersu.myconcurrency.annotation.NotRecommend;
import com.xandersu.myconcurrency.annotation.NotThreadSafe;
import com.xandersu.myconcurrency.annotation.ThreadSafe;

/**
 * @Author: suxun
 * @Date: 2018/12/16 20:19
 * @Description: 单例模式-懒汉模式
 */
@ThreadSafe
@NotRecommend
public class SingletonExample3 {
    //私有化构造函数
    private SingletonExample3() {
    }
    //单例对象
    private static SingletonExample3 instance = null;
    //静态的工厂方法
    public synchronized static SingletonExample3 getInstance() {
        if (instance == null) {
            instance = new SingletonExample3();
        }
        return instance;
    }
}
