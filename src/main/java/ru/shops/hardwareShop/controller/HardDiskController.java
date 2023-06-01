package ru.shops.hardwareShop.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.shops.hardwareShop.repository.HardDiskRepository;

@RestController
@AllArgsConstructor
public class HardDiskController {
    private final HardDiskRepository hards;
}
