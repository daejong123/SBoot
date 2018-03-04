package com.dottie.boot.Configuration;

import com.dottie.boot.Filter.LogCostFitler;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        LogCostFitler logCostFitler = new LogCostFitler();
        filterRegistrationBean.setFilter(logCostFitler);
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setName("LogCostFilter");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}

/**
 区别：
 拦截器是基于java的反射机制的，而过滤器是基于函数回调
 过滤器依赖与servlet容器，而拦截器不依赖与servlet容器
 拦截器只能对action请求起作用，而过滤器则可以对几乎所有的请求起作用
 拦截器可以访问action上下文、值栈里的对象，而过滤器不能
 在action的生命周期中，拦截器可以多次被调用，而过滤器只能在容器初始化时被调用一次


 用途：
 过滤器，主要的用途是过滤字符编码、做一些业务逻辑判断等。

 监听器，做一些初始化的内容添加工作、设置一些基本的内容、比如一些参数或者是一些固定的对象等等

 拦截器，在面向切面编程中应用的，就是在你的service或者一个方法前调用一个方法，或者在方法后调用一个方法。是基于JAVA的反射机制
 * */