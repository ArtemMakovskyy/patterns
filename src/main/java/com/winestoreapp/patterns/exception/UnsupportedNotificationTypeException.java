package com.winestoreapp.patterns.exception;

public class UnsupportedNotificationTypeException extends RuntimeException {

    public UnsupportedNotificationTypeException(Object type) {
        super("Notification type not supported: " + type);
    }
}