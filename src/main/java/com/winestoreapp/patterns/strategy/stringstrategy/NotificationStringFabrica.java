package com.winestoreapp.patterns.strategy.stringstrategy;

import com.winestoreapp.patterns.exception.UnsupportedNotificationTypeException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class NotificationStringFabrica {

    private final Map<String, NotificationStringStrategy> strategies;

    public NotificationStringFabrica(List<NotificationStringStrategy> strategies) {
        this.strategies = strategies.stream()
                .collect(Collectors.toMap(
                        s -> s.getStrategyName().toLowerCase(),
                        s -> s));
    }

    public String notify(String message, String type) {
        NotificationStringStrategy strategy = strategies.get(type.toLowerCase());

        if (strategy == null) {
            throw new UnsupportedNotificationTypeException(type);
        }

        return strategy.send(message);
    }

}
