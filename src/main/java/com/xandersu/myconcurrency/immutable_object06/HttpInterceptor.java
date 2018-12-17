package com.xandersu.myconcurrency.immutable_object06;

import com.xandersu.myconcurrency.immutable_object06.threadlocal.MyRequestHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: suxun
 * @Date: 2018/12/17 21:23
 * @Description:
 */
@Slf4j
public class HttpInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("preHandle");
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        MyRequestHolder.remove();
        log.info("afterCompletion");
    }
}
