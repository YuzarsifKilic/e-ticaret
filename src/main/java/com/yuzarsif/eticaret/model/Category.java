package com.yuzarsif.eticaret.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Enumerated(EnumType.STRING)
    @Column(name = "category_type")
    private CategoryType categoryType;
    private String subCategory;
    @OneToMany(mappedBy = "category")
    private Set<Product> products = new HashSet<>();

    public Category() {}

    public Category(int id, CategoryType categoryType, String subCategory, Set<Product> products) {
        this.id = id;
        this.categoryType = categoryType;
        this.subCategory = subCategory;
        this.products = products;
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

    public Set<Product> getProducts() {
        return products;
    }
}
