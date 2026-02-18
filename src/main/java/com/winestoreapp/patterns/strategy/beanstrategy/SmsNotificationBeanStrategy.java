package com.winestoreapp.patterns.strategy.beanstrategy;

import org.springframework.stereotype.Component;

@Component("smsNotificationBean")
public class SmsNotificationBeanStrategy
        implements NotificationBeanStrategy {

    @Override
    public String send(String message) {
        return "SEND SMS via Bean: " + message;
    }
}
