package com.dottie.boot.Configuration;

import com.dottie.boot.Interceptor.LogCostInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LogCostInterceptor logCostInterceptor = new LogCostInterceptor();
        registry.addInterceptor(logCostInterceptor).addPathPatterns("/*");
        super.addInterceptors(registry);
    }
}
