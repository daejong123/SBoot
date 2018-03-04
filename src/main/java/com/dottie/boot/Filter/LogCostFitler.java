package com.dottie.boot.Filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 测试 filter
 * 请求操作耗时例子
 * 过滤器，主要的用途是过滤字符编码、做一些业务逻辑判断等。
 */
@Slf4j
public class LogCostFitler implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        long start = System.currentTimeMillis();
        filterChain.doFilter(httpServletRequest, httpServletResponse);
        log.info("操作耗时: " + (System.currentTimeMillis() - start) + " 毫秒");
    }

    @Override
    public void destroy() {

    }
}
