package com.yuzarsif.eticaret.dto.model;

import com.yuzarsif.eticaret.model.CategoryType;

import java.util.Set;

public class CategoryDto {

    private int id;
    private CategoryType categoryType;
    private String subCategory;
    private Set<CategoryProductDto> product;

    public CategoryDto() {}

    public CategoryDto(int id, CategoryType categoryType, String subCategory, Set<CategoryProductDto> product) {
        this.id = id;
        this.categoryType = categoryType;
        this.subCategory = subCategory;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public Set<CategoryProductDto> getProduct() {
        return product;
    }
}
