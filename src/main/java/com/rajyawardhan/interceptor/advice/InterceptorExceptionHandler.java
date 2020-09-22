package com.rajyawardhan.interceptor.advice;

import com.rajyawardhan.interceptor.exception.InvalidShameException;
import com.rajyawardhan.interceptor.exception.InvalidUserException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class InterceptorExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<String> invalidLoginId(InvalidUserException invalidUserException) {
        return new ResponseEntity<>(invalidUserException.getMessage(), HttpStatus.PRECONDITION_FAILED);
    }

    @ExceptionHandler
    public ResponseEntity<String> invalidShame(InvalidShameException invalidShaeException) {
        return new ResponseEntity<>(invalidShaeException.getMessage(), HttpStatus.PRECONDITION_FAILED);
    }

}
