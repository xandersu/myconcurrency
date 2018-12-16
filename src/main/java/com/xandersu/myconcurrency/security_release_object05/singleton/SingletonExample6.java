package com.xandersu.myconcurrency.security_release_object05.singleton;


import com.xandersu.myconcurrency.annotation.ThreadSafe;

/**
 * @Author: suxun
 * @Date: 2018/12/16 20:19
 * @Description:
 */
@ThreadSafe
public class SingletonExample6 {
    //私有化构造函数
    private SingletonExample6() {
    }

    //单例对象
    private static SingletonExample6 instance = null;
    //静态代码块如果在声明上面会空指针，静态代码块的顺序会影响实例化
    //如果把=null删掉就没事
    static {
        instance = new SingletonExample6();
    }



    //静态的工厂方法
    public static SingletonExample6 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(SingletonExample6.getInstance().hashCode());
    }
}
