package com.winestoreapp.patterns.strategy.registermyselfstrategy;


import org.springframework.stereotype.Component;

@Component
public class ChatNotificationStrategy implements NotificationStrategy {

    @Override
    public String getCode() {
        return "chat";
    }

    @Override
    public String send(String message) {
        return "SEND CHAT: " + message;
    }
}
