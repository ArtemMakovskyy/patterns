package com.winestoreapp.patterns.strategy.registermyselfstrategy;

import com.winestoreapp.patterns.exception.UnsupportedNotificationTypeException;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class NotificationRegistryFabrica {

    private final Map<String, NotificationStrategy> strategies
            = new ConcurrentHashMap<>();

    public void register(String code, NotificationStrategy strategy) {
        strategies.put(code.toLowerCase(), strategy);
    }

    public String notify(String code, String message) {
        NotificationStrategy strategy = strategies.get(code.toLowerCase());
        if (strategy == null) {
            throw new UnsupportedNotificationTypeException(code);
        }
        return strategy.send(message);
    }
}
