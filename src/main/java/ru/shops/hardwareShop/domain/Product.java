package ru.shops.hardwareShop.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long serialNumbrer;

    private String manufacturer;

    private Double price;

    private int quantity;
}
