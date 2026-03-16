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
    private Double price;

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;


    }
}
