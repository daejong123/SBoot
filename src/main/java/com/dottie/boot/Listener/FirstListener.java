package com.dottie.boot.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 监听器，做一些初始化的内容添加工作、设置一些基本的内容、比如一些参数或者是一些固定的对象等等
 */
@WebListener
public class FirstListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("listener 初始化。。。");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("listener 销毁");
    }
}
