package ru.shops.hardwareShop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "monitor")
public class Monitor extends Product {
    private int diagonal;

}
