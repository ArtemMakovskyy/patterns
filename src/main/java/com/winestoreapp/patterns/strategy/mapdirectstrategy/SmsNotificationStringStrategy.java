package com.winestoreapp.patterns.strategy.mapdirectstrategy;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsNotificationStringStrategy implements NotificationStringStrategy {

    @Override
    public String send(String message) {
        return "SEND SMS: " + message;
    }
}