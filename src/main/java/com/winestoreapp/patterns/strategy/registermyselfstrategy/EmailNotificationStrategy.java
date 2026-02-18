package com.winestoreapp.patterns.strategy.registermyselfstrategy;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationStrategy implements NotificationStrategy {

    @Override
    public String getCode() {
        return "email";
    }

    @Override
    public String send(String message) {
        return "SEND EMAIL: " + message;
    }
}
