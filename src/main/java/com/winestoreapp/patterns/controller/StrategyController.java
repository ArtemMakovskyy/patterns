package com.winestoreapp.patterns.controller;

import com.winestoreapp.patterns.strategy.beanstrategy.NotificationBeanFabrica;
import com.winestoreapp.patterns.strategy.enumgstrategy.NotificationEnumFabrica;
import com.winestoreapp.patterns.strategy.enumgstrategy.NotificationType;
import com.winestoreapp.patterns.strategy.stringstrategy.NotificationStringFabrica;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/strategy")
public class StrategyController {

    private final NotificationStringFabrica notificationStringFabrica;
    private final NotificationEnumFabrica  notificationEnumFabrica;
    private final NotificationBeanFabrica notificationBeanFabrica;

    @GetMapping("/string/{type}")
    public ResponseEntity<String> stringType(@PathVariable String type) {
        String notification = notificationStringFabrica.notify("stringType", type);
        return ResponseEntity.ok(notification);
    }

    @GetMapping("/enum/{type}")
    public ResponseEntity<String> enumType(@PathVariable NotificationType type) {
        String result = notificationEnumFabrica.notify("enumType", type);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/bean/{beanName}")
    public ResponseEntity<String> beanType(@PathVariable String beanName) {
        String result = notificationBeanFabrica.notify("beanType", beanName);
        return ResponseEntity.ok(result);
    }
}
