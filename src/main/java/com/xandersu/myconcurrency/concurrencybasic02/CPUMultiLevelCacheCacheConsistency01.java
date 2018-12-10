package com.xandersu.myconcurrency.concurrencybasic02;

/**
 * @Author: suxun
 * @Date: 2018/12/10 21:48
 * @Description: CPU多级缓存-缓存一致性
 * CPU多级缓存：
 * 为什么需要CPU cache：CPU频率太快了，主存跟不上，这样在处理器时钟周期内，cpu常常需要等待主存，浪费资源。
 * 所以cache出现，是为了缓解CPU和内存之间速度的不匹配问题（cpu-》cache=》memory）
 * CPU cache 意义：
 * 1）时间局部性：如果某个数据被访问，在不久的将来很可能再次被访问
 * 2）空间局部性：如果某个数据被访问，那么与他相邻的数据很快也可能被访问
 * CPU多级缓存-缓存一致性（MESI）
 * 用于保证多个cpu cache之间缓存共享数据的一致
 */
public interface CPUMultiLevelCacheCacheConsistency01 {
}
