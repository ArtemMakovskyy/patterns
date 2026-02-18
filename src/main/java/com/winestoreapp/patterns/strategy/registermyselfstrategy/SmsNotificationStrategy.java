package com.winestoreapp.patterns.strategy.registermyselfstrategy;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificationStrategy implements NotificationStrategy {

    @Override
    public String getCode() {
        return "sms";
    }

    @Override
    public String send(String message) {
        return "SEND SMS: " + message;
    }
}
