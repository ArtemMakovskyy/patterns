package com.winestoreapp.patterns.strategy.stringstrategy;

public interface NotificationStringStrategy {
    String send(String message);
    String getStrategyName();
}
