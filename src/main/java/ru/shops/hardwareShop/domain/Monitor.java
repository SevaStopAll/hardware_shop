package ru.shops.hardwareShop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Monitor {
    @Id
    private long id;
    private long serialNumbrer;
    private String manufacturer;
    private Double price;
    private int quantity;
    private int diagonal;

}
