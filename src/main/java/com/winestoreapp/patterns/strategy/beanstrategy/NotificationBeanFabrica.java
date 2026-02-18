package com.winestoreapp.patterns.strategy.beanstrategy;

import com.winestoreapp.patterns.exception.UnsupportedNotificationTypeException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class NotificationBeanFabrica {

    private final ApplicationContext context;

    public NotificationBeanFabrica(ApplicationContext context) {
        this.context = context;
    }

    public String notify(String message, String beanName) {
        if (!context.containsBean(beanName)) {
            throw new UnsupportedNotificationTypeException(beanName);
        }

        NotificationBeanStrategy strategy = context.getBean(beanName, NotificationBeanStrategy.class);
        return strategy.send(message);
    }
}
