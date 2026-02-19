package com.winestoreapp.patterns.controller;

import com.winestoreapp.patterns.strategy.beanstrategy.NotificationBeanFabrica;
import com.winestoreapp.patterns.strategy.enumgstrategy.NotificationEnumFabrica;
import com.winestoreapp.patterns.strategy.enumgstrategy.NotificationType;
import com.winestoreapp.patterns.strategy.mapdirectstrategy.NotificationMapStringFabrica;
import com.winestoreapp.patterns.strategy.registermyselfstrategy.NotificationRegistryFabrica;
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

    private final String link = "https://www.youtube.com/watch?v=61duchvKI6o";

    private final NotificationStringFabrica notificationStringFabrica;
    private final NotificationEnumFabrica notificationEnumFabrica;
    private final NotificationBeanFabrica notificationBeanFabrica;
    private final NotificationRegistryFabrica notificationRegistryFabrica;
    private final NotificationMapStringFabrica notificationMapStringFabrica;

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

    @GetMapping("/register/{type}")
    public ResponseEntity<String> registerMyselfType(@PathVariable String type) {
        String result = notificationRegistryFabrica.notify(type, "registerMyselfType");
        return ResponseEntity.ok(result);
    }

    @GetMapping("/map/{type}")
    public ResponseEntity<String> mapDirectType(@PathVariable String type) {
        String result = notificationMapStringFabrica.notify("mapDirectType", type);
        return ResponseEntity.ok(result);
    }
}
