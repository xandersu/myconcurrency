package com.xandersu.myconcurrency.immutable_object06;


import com.xandersu.myconcurrency.immutable_object06.threadlocal.MyRequestHolder;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: suxun
 * @Date: 2018/12/17 21:15
 * @Description:
 */
@Slf4j
public class MyHttpFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        log.info("do filter,{},{}", Thread.currentThread().getId(), request.getServletPath());
        MyRequestHolder.add(Thread.currentThread().getId());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
