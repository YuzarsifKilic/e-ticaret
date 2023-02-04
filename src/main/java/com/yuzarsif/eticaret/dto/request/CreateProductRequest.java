package com.yuzarsif.eticaret.dto.request;

public class CreateProductRequest {

    private int categoryId;
    private String name;
    private double price;

    public CreateProductRequest() {}

    public CreateProductRequest(int categoryId, String name, double price) {
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
