package com.winestoreapp.patterns.strategy.mapdirectstrategy;

import org.springframework.stereotype.Component;

@Component("chat")
public class ChatNotificationStringStrategy implements NotificationStringStrategy {

    @Override
    public String send(String message) {
        return "SEND CHAT: " + message;
    }
}