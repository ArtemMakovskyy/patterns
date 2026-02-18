package com.winestoreapp.patterns.strategy.beanstrategy;

import org.springframework.stereotype.Component;

@Component("chatNotificationBean")
public class ChatNotificationBeanStrategy implements NotificationBeanStrategy {

    @Override
    public String send(String message) {
        return "SEND CHAT via Bean: " + message;
    }
}