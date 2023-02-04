package com.yuzarsif.eticaret.dto.converter;

import com.yuzarsif.eticaret.dto.model.CategoryDto;
import com.yuzarsif.eticaret.model.Category;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CategoryDtoConvert {

    private final CategoryProductDtoConverter converter;

    public CategoryDtoConvert(CategoryProductDtoConverter converter) {
        this.converter = converter;
    }

    public CategoryDto convert(Category from) {
        return new CategoryDto(
                from.getId(),
                from.getCategoryType(),
                from.getSubCategory(),
                from.getProducts()
                        .stream()
                        .map(converter::convert)
                        .collect(Collectors.toSet()));
    }
}
