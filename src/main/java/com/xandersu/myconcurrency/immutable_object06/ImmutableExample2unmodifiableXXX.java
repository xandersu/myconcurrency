package com.xandersu.myconcurrency.immutable_object06;

import com.google.common.collect.Maps;
import com.xandersu.myconcurrency.annotation.ThreadSafe;

import java.util.Collections;
import java.util.Map;

/**
 * @Author: suxun
 * @Date: 2018/12/17 21:01
 * @Description:
 */
@ThreadSafe
public class ImmutableExample2unmodifiableXXX {

    private static Map<Integer, Integer> map = Maps.newHashMap();

    static {
        map.put(1, 2);
        map.put(2, 3);
        map.put(4, 5);
        //一旦初始化后不可以被修改
        map = Collections.unmodifiableMap(map);
    }

    public static void main(String[] args) {
        map.put(1,3);
        System.out.println(map.get(1));
    }
}
