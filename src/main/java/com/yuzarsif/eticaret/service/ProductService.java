package com.yuzarsif.eticaret.service;

import com.yuzarsif.eticaret.dto.converter.ProductDtoConverter;
import com.yuzarsif.eticaret.dto.model.ProductDto;
import com.yuzarsif.eticaret.dto.request.CreateProductRequest;
import com.yuzarsif.eticaret.exception.ProductNotFoundException;
import com.yuzarsif.eticaret.model.Category;
import com.yuzarsif.eticaret.model.Product;
import com.yuzarsif.eticaret.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryService categoryService;
    private final ProductDtoConverter converter;

    public ProductService(ProductRepository productRepository, CategoryService categoryService, ProductDtoConverter converter) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
        this.converter = converter;
    }


    public List<ProductDto> getAll() {
        return productRepository.findAll().stream().map(converter::convert).collect(Collectors.toList());
    }

    public ProductDto createProduct(CreateProductRequest request) {
        Category category = categoryService.findById(request.getCategoryId());
        Product product = new Product(category, request.getName(), request.getPrice());
        return converter.convert(productRepository.save(product));
    }

    public ProductDto getById(Long id) {
        return converter.convert(productRepository
                .findById(id)
                .orElseThrow(
                        () -> new ProductNotFoundException(id + " ye sahip bir product bulunamadı")));
    }
}
