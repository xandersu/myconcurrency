package com.xandersu.myconcurrency.immutable_object06.threadlocal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: suxun
 * @Date: 2018/12/17 21:35
 * @Description:
 */
@RestController
@RequestMapping("/threadLocal")
public class ThreadLocalController {

    @RequestMapping("/test")
    public long test() {
        return MyRequestHolder.getId();
    }
}
