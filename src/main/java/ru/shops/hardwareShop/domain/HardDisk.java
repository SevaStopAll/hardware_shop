package ru.shops.hardwareShop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "hard_disk")
public class HardDisk extends Product {
    private int volume;

}
