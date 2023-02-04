package com.yuzarsif.eticaret.dto.model;

public class ProductDto {

    private Long id;
    private ProductCategoryDto category;
    private String name;
    private double price;

    public ProductDto() {}

    public ProductDto(Long id, ProductCategoryDto category, String name, double price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public ProductCategoryDto getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
