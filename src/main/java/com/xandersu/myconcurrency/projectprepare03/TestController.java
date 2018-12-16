package com.xandersu.myconcurrency.projectprepare03;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: suxun
 * @Date: 2018/12/16 16:31
 * @Description:
 */
@Slf4j
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return "test";
    }

}
