package com.xandersu.myconcurrency.threadsafety04;

import com.xandersu.myconcurrency.annotation.ThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @Author: suxun
 * @Date: 2018/12/16 17:15
 * @Description:
 */
@Slf4j
@ThreadSafe
public class CountExample5AtomicIntegerFieldUpdater {
    //原子性的更新某个类的实例的指定的某个字段，这个字段必须用volatile修饰并且不能是static
    private static AtomicIntegerFieldUpdater<CountExample5AtomicIntegerFieldUpdater> updater = AtomicIntegerFieldUpdater.newUpdater(CountExample5AtomicIntegerFieldUpdater.class, "count");
    //使用AtomicIntegerFieldUpdater必须使用volatile关键字修饰
    @Getter
    private volatile int count = 100;

    public static void main(String[] args) throws Exception {
        CountExample5AtomicIntegerFieldUpdater example5 = new CountExample5AtomicIntegerFieldUpdater();

        //判断并更新，期望100，如果是则更新成120 返回true，不是返回false
        if (updater.compareAndSet(example5, 100, 120)) {
            log.info("update success 1 count={}", example5.getCount());
        }
        if (updater.compareAndSet(example5, 100, 120)) {
            log.info("update success 2 count={}", example5.getCount());
        } else {
            log.info("update failed 2");
        }
    }
}
