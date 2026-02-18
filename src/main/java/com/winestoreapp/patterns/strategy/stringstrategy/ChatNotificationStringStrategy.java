package com.winestoreapp.patterns.strategy.stringstrategy;

import org.springframework.stereotype.Component;

@Component
public class ChatNotificationStringStrategy implements NotificationStringStrategy {
    @Override
    public String send(String message) {
       System.out.println("SEND CHAT");
        return "SEND CHAT";
    }

    @Override
    public String getStrategyName() {
        return "chat";
    }
}
