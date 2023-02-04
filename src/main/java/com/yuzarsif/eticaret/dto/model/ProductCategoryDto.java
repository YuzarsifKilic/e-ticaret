package com.yuzarsif.eticaret.dto.model;

import com.yuzarsif.eticaret.model.CategoryType;

public class ProductCategoryDto {

    private int id;
    private CategoryType categoryType;
    private String subCategory;

    public ProductCategoryDto() {}

    public ProductCategoryDto(int id, CategoryType categoryType, String subCategory) {
        this.id = id;
        this.categoryType = categoryType;
        this.subCategory = subCategory;
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
}
