package com.dottie.boot.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 使用注解的方式来使用过滤器
 * 注意这种方式要在启动类中加上 @ServletComponentScan
 *
 *
 * 这里直接用@WebFilter就可以进行配置，同样，可以设置url匹配模式，过滤器名称等。
 * 这里需要注意一点的是@WebFilter这个注解是Servlet3.0的规范，并不是Spring boot提供的。
 * 除了这个注解以外，我们还需在配置类中加另外一个注解：@ServletComponetScan，指定扫描的包。
 */
@WebFilter(filterName = "AnnoFilter", urlPatterns = {"/hello", "/index"})
public class AnnoFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("注解方式使用过滤器。。。");
    }

    @Override
    public void destroy() {

    }
}
