package com.winestoreapp.patterns.strategy.stringstrategy;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationStringStrategy implements NotificationStringStrategy {
    @Override
    public String send(String message) {
        System.out.println("SEND EMAIL");
        return "SEND EMAIL";
    }

    @Override
    public String getStrategyName() {
        return "email";
    }
}
