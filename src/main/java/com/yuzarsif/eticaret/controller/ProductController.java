package com.yuzarsif.eticaret.controller;

import com.yuzarsif.eticaret.dto.model.ProductDto;
import com.yuzarsif.eticaret.dto.request.CreateProductRequest;
import com.yuzarsif.eticaret.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public List<ProductDto> getAll() {
        return productService.getAll();
    }

    @PostMapping("/save")
    public ProductDto save(@RequestBody CreateProductRequest request) {
        return productService.createProduct(request);
    }

    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable Long id) {
        return productService.getById(id);
    }
}
