package com.winestoreapp.patterns.strategy.enumgstrategy;

import org.springframework.stereotype.Component;

@Component
public class ChatNotificationEnumStrategy implements NotificationEnumStrategy{
    @Override
    public NotificationType getType() {
        return NotificationType.CHAT;
    }

    @Override
    public String send(String message) {
        return "SEND CHAT: " + message;
    }
}
