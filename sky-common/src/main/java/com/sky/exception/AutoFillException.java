package com.sky.exception;

public class AutoFillException extends RuntimeException {
    public AutoFillException(String message, Exception e) {
        super(message);
    }
}
