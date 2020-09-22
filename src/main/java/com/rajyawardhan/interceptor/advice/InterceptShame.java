package com.rajyawardhan.interceptor.advice;

import com.rajyawardhan.interceptor.exception.InvalidShameException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class InterceptShame implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws InvalidShameException {
        if ("valid-shame".equals(request.getHeader("shame-header"))) return true;
        throw new InvalidShameException("Invalid shame");
    }
}
