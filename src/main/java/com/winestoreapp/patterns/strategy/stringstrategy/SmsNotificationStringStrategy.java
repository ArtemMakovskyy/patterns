package com.winestoreapp.patterns.strategy.stringstrategy;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificationStringStrategy implements NotificationStringStrategy {
    @Override
    public String send(String message) {
        System.out.println("SEND SMS");
        return "SEND SMS";
    }

    @Override
    public String getStrategyName() {
        return "sms";
    }
}
