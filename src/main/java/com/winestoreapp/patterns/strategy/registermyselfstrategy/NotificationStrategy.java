package com.winestoreapp.patterns.strategy.registermyselfstrategy;
import org.springframework.beans.factory.annotation.Autowired;

public interface NotificationStrategy {

    String getCode();

    String send(String message);

    @Autowired
    default void registerMyself(NotificationRegistryFabrica registry) {
        registry.register(getCode(), this);
    }
}
