package ru.shops.hardwareShop.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.shops.hardwareShop.service.MonitorService;

@RestController
@AllArgsConstructor
public class MonitorController {
    private final MonitorService monitors;
}
