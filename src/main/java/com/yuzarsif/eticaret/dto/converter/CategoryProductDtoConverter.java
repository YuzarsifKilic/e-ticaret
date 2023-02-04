package com.yuzarsif.eticaret.dto.converter;

import com.yuzarsif.eticaret.dto.model.CategoryProductDto;
import com.yuzarsif.eticaret.model.Product;
import org.springframework.stereotype.Component;

@Component
public class CategoryProductDtoConverter {

    public CategoryProductDto convert(Product from) {
        return new CategoryProductDto(from.getId(), from.getName(), from.getPrice());
    }
}
