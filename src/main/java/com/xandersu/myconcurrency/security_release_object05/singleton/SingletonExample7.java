package com.xandersu.myconcurrency.security_release_object05.singleton;


import com.xandersu.myconcurrency.annotation.Recommend;
import com.xandersu.myconcurrency.annotation.ThreadSafe;

/**
 * @Author: suxun
 * @Date: 2018/12/16 20:19
 * @Description:
 */
@ThreadSafe
@Recommend
public class SingletonExample7 {
    //私有化构造函数
    private SingletonExample7() {
    }

    public static SingletonExample7 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;

        private SingletonExample7 singleton;

        //构造函数，JVM保证这个方法绝对只调用一次
        Singleton() {
            singleton = new SingletonExample7();
        }

        public SingletonExample7 getInstance() {
            return singleton;
        }
    }

}
