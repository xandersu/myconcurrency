package com.xandersu.myconcurrency.security_release_object05.singleton;


import com.xandersu.myconcurrency.annotation.NotRecommend;
import com.xandersu.myconcurrency.annotation.NotThreadSafe;
import com.xandersu.myconcurrency.annotation.ThreadSafe;

/**
 * @Author: suxun
 * @Date: 2018/12/16 20:19
 * @Description: 单例模式-懒汉模式
 */
@NotThreadSafe
public class SingletonExample4 {
    //私有化构造函数
    private SingletonExample4() {
    }

    //1、memory = allocate() 分配对象的内存空间
    //2、ctorInstance() 初始化对象
    //3、instance = memory 设置instance指向刚分配的内存
    //JVM和cpu优化发生指令重排序 1- 3 -2

    //单例对象
    private static SingletonExample4 instance = null;

    //静态的工厂方法
    //双重检测
    //同步锁
    public static SingletonExample4 getInstance() {
        if (instance == null) {
            synchronized (SingletonExample4.class) {
                if (instance == null) {
                    instance = new SingletonExample4();
                }
            }
        }
        return instance;
    }
}
