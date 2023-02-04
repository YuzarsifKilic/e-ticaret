package com.yuzarsif.eticaret.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
    private String name;
    private double price;

    public Product() {}

    public Product(Category category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public Product(Long id, Category category, String name, double price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
