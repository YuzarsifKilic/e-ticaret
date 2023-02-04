package com.yuzarsif.eticaret.dto.model;

public class CategoryProductDto {

    private Long id;
    private String name;
    private double price;

    public CategoryProductDto() {}

    public CategoryProductDto(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
