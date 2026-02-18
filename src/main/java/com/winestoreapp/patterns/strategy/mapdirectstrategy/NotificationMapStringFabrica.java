package com.winestoreapp.patterns.strategy.mapdirectstrategy;

import com.winestoreapp.patterns.exception.UnsupportedNotificationTypeException;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class NotificationMapStringFabrica {

    private final Map<String, NotificationStringStrategy> strategies;

    public NotificationMapStringFabrica(Map<String, NotificationStringStrategy> strategies) {
        this.strategies = strategies;
    }

    public String notify(String message, String type) {
        NotificationStringStrategy strategy = strategies.get(type);

        if (strategy == null) {
            throw new UnsupportedNotificationTypeException(type);
        }

        return strategy.send(message);
    }
}
