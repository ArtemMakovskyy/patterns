package com.winestoreapp.patterns.strategy.enumgstrategy;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificationEnumStrategy implements NotificationEnumStrategy{
    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }

    @Override
    public String send(String message) {
        return "SEND SMS: " + message;
    }
}
