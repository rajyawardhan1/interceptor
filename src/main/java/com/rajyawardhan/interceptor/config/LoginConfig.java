package com.rajyawardhan.interceptor.config;

import com.rajyawardhan.interceptor.advice.InterceptShame;
import com.rajyawardhan.interceptor.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Autowired
    private InterceptShame interceptShame;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/employee/**");
        registry.addInterceptor(interceptShame).addPathPatterns("/temp/**");
    }
}
