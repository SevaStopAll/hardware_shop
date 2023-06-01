package ru.shops.hardwareShop.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.shops.hardwareShop.service.PCService;

@RestController
@AllArgsConstructor
public class PCController {
    private final PCService pcs;
}
