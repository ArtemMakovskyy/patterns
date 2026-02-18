package com.winestoreapp.patterns.strategy.enumgstrategy;

import com.winestoreapp.patterns.exception.UnsupportedNotificationTypeException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class NotificationEnumFabrica {

    private final Map<NotificationType, NotificationEnumStrategy> strategies;

    public NotificationEnumFabrica(List<NotificationEnumStrategy> strategies) {
        this.strategies = strategies.stream()
                .collect(Collectors.toMap(
                        NotificationEnumStrategy::getType,
                        strategy -> strategy
                ));
    }

    public String notify(String message, NotificationType type) {
        NotificationEnumStrategy strategy = strategies.get(type);

        if (strategy == null) {
            throw new UnsupportedNotificationTypeException(type);
        }

        return strategy.send(message);
    }
}
