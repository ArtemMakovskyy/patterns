package com.winestoreapp.patterns.strategy.enumgstrategy;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationEnumStrategy implements NotificationEnumStrategy{
    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }

    @Override
    public String send(String message) {
        return "SEND EMAIL: " + message;
    }
}
