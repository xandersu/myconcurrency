package com.xandersu.myconcurrency.immutable_object06;

/**
 * @Author: suxun
 * @Date: 2018/12/17 20:30
 * @Description: 不可变对象
 * 不可变对象满足的条件：
 * 1、对象创建以后其状态就不能改变
 * 2、对象所有域都是final类型
 * 3、对象是正确创建的(在对象创建期间，this引用没有逸出)
 * ·
 * final修饰类，方法和变量
 * 1、修饰类：不能被继承；final类的所有方法都会被隐似的修饰为final；谨慎选择；
 * 2、修饰方法：1、锁定方法不能被继承类修改；2、效率；(private方法隐似final方法)
 * 3、变量：基本数据类型(初始化后不能修改)、引用类型变量(初始化后不能被指向另外一个对象)
 * ·
 * Collections.unmodifiableXXX:Collection、List、Set、Map... 一旦初始化后，值不允许改变
 * Guava:ImmutableXXX:Collection、List、Set、Map...
 * ·
 * Ad-hoc 线程封闭：程序控制实现，最糟糕，忽略
 * 堆栈封闭：局部变量，无并发问题
 * ThreadLocal 线程封闭：很好的封闭办法。jdbc connection对象 内部有map
 * ·
 * 线程不安全的写法
 * StringBuffer
 * joda-time DateTimeFormatter
 * 先检查再执行 if(condition(a)){handle(a);}
 * `
 * 线程安全-同步容器
 * ArrayList -> Vector,Stack
 * HashMap -> HashTable(key/value not null)
 * Collections.synchronizedXXX(List,Set,Map)
 * `
 * 并发容器J.U.C
 * ArrayList -> CopyOnWriteArrayList
 *
 *
 */
public interface ImmutableObject {
}
