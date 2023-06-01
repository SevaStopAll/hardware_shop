package ru.shops.hardwareShop.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.shops.hardwareShop.service.LaptopService;

@RestController
@AllArgsConstructor
public class LaptopController {
    private final LaptopService laptops;
}
