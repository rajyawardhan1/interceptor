package com.rajyawardhan.interceptor.interceptor;

import com.rajyawardhan.interceptor.exception.InvalidUserException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws InvalidUserException {
        if("1425861".equals(request.getHeader("userId"))) return true;
        throw new InvalidUserException("User Not Found");
    }
}
