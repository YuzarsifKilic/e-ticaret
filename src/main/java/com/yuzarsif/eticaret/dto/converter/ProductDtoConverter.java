package com.yuzarsif.eticaret.dto.converter;

import com.yuzarsif.eticaret.dto.model.ProductDto;
import com.yuzarsif.eticaret.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductDtoConverter {

    private final ProductCategoryDtoConverter converter;

    public ProductDtoConverter(ProductCategoryDtoConverter converter) {
        this.converter = converter;
    }

    public ProductDto convert(Product from) {
        return new ProductDto(from.getId(), converter.convert(from.getCategory()), from.getName(), from.getPrice());
    }
}
