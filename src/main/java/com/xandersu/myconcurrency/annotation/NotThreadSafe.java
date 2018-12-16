package com.xandersu.myconcurrency.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: suxun
 * @Date: 2018/12/16 16:21
 * @Description: 课程里标记线程不安全的类或者写法
 */
@Target(ElementType.TYPE)   //注解作用的目标
//注解作用范围
//runtime 注解会在字节码中存在，运行时通过反射拿到
//source 编译时忽略掉
@Retention(RetentionPolicy.SOURCE)
public @interface NotThreadSafe {

    String value() default "";
}
