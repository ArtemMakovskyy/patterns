package com.winestoreapp.patterns.strategy.mapdirectstrategy;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotificationStringStrategy implements NotificationStringStrategy {

    @Override
    public String send(String message) {
        return "SEND EMAIL: " + message;
    }
}