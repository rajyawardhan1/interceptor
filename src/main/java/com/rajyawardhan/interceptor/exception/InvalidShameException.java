package com.rajyawardhan.interceptor.exception;

public class InvalidShameException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String message;

    public InvalidShameException(String message) {
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
