package ru.shops.hardwareShop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HardDisk {
    @Id
    private long id;
    private long serialNumber;
    private String manufacturer;
    private Double price;
    private int quantity;
    private int volume;
}
