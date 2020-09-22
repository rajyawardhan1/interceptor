package com.rajyawardhan.interceptor.exception;

public class InvalidUserException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String message;

    public InvalidUserException(String message) {
        this.setMessage(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
