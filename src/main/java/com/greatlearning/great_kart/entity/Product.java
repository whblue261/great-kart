package com.greatlearning.great_kart.entity;

import jakarta.persistence.*;

@Entity
//@Table(name = "item")

public class Product {
    @Id
    @GeneratedValue
    private Long id;
    //@Column(name = "title")
    private String name;
    private String price;

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public Product(Long id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;


    }
}
