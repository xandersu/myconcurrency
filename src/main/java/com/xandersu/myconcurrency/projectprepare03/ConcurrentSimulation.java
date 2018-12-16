package com.xandersu.myconcurrency.projectprepare03;

/**
 * @Author: suxun
 * @Date: 2018/12/16 16:29
 * @Description: 并发模拟
 * Postman：http请求模拟工具
 * Apache Bench AB： Apache附带的工具，测试网站的性能
 * JMeter：Apache组织开发的压力测试工具
 * 代码：semaphore，CountDownLatch
 * `
 * Apache Bench (AB):命令行工具
 * ab -n 1000 -c 50 http://localhost:8080/test
 * ab -n 多少次 -c 并发数 [http[s]://]hostname[:port]/path
 * Server Software:
 * Server Hostname:        localhost
 * Server Port:            8080
 *
 * Document Path:          /test
 * Document Length:        4 bytes
 *
 * Concurrency Level:      50               --并发量
 * Time taken for tests:   0.306 seconds    --整个测试所用时间
 * Complete requests:      1000             --完成的请求数
 * Failed requests:        0                --失败的请求数
 * Total transferred:      136000 bytes     --所有请求的响应数据的长度综合，包括每个http头信息和正文数据的长度。这里不包括http请求的数据长度，仅仅为web服务器流向用户pc的应用层数据总和。
 * HTML transferred:       4000 bytes       --所有请求的响应数据的正文数据的总和，就是Total transferred减去头信息数据的长度
 * Requests per second:    3264.55 [#/sec] (mean)   --吞吐率，跟请求数相关的
 * Time per request:       15.316 [ms] (mean)       --用户平均请求等待时间
 * Time per request:       0.306 [ms] (mean, across all concurrent requests)    --服务器平均请求等待时间
 * Transfer rate:          433.57 [Kbytes/sec] received     --表示请求在单位时间内在服务器获取的数据长度
 *
 * Connection Times (ms)
 *               min  mean[+/-sd] median   max
 * Connect:        0    6   2.4      6      14
 * Processing:     2    9   5.1      8      40
 * Waiting:        1    7   4.4      6      36
 * Total:          5   15   4.7     14      42
 *
 * Percentage of the requests served within a certain time (ms)
 *   50%     14
 *   66%     15
 *   75%     17
 *   80%     18
 *   90%     20
 *   95%     22
 *   98%     31
 *   99%     35
 *  100%     42 (longest request)
 *  ===================================================================
 *  JMeter   sh jmeter.sh
 *  cd Desktop/
 *  cd Mac环境/
 *  cd apache-jmeter-5.0
 *  cd bin
 *  sh jmeter.sh
 *  ===================================================================
 *  代码：CountDownLatch 计数器闭锁 阻塞线程，满足某种情况下线程继续进行
 *  semaphore：信号量 阻塞进程，限制并发量
 *
 */
public interface ConcurrentSimulation {
}
