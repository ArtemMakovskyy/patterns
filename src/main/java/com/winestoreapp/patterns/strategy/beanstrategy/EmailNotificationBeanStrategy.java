package com.winestoreapp.patterns.strategy.beanstrategy;

import org.springframework.stereotype.Component;

@Component("emailNotificationBean")
public class EmailNotificationBeanStrategy implements NotificationBeanStrategy {

    @Override
    public String send(String message) {
        return "SEND EMAIL via Bean: " + message;
    }
}
