package com.yuzarsif.eticaret.dto.converter;

import com.yuzarsif.eticaret.dto.model.ProductCategoryDto;
import com.yuzarsif.eticaret.model.Category;
import org.springframework.stereotype.Component;

@Component
public class ProductCategoryDtoConverter {

    public ProductCategoryDto convert(Category from) {
        return new ProductCategoryDto(from.getId(), from.getCategoryType(), from.getSubCategory());
    }
}
