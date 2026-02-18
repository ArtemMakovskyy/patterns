package com.winestoreapp.patterns.strategy.enumgstrategy;

public interface NotificationEnumStrategy {
    NotificationType getType();

    String send(String message);
}
