package com.xandersu.myconcurrency.immutable_object06;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
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
public class ImmutableExample3Guava {

    private final static ImmutableList list = ImmutableList.of();
    private final static ImmutableSet set = ImmutableSet.of(list);
    private final static ImmutableMap<Integer, Integer> map = ImmutableMap.of(1, 2, 3, 4);
    private final static ImmutableMap<Integer, Integer> map2 = ImmutableMap
            .<Integer, Integer>builder().put(1, 2).put(3, 4).build();

    public static void main(String[] args) {
//        list.add(4);
//        set.add(5);
        map.putIfAbsent(5, 6);
    }
}
