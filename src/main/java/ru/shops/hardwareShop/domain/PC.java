package ru.shops.hardwareShop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PC")
public class PC extends Product {
    private String formFactor;
}
