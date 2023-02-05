package com.yuzarsif.eticaret.controller;

import com.yuzarsif.eticaret.dto.model.ProductDto;
import com.yuzarsif.eticaret.dto.request.CreateProductRequest;
import com.yuzarsif.eticaret.service.ProductService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<ProductDto>> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<ProductDto> save(@RequestBody CreateProductRequest request) {
        return ResponseEntity.ok(productService.createProduct(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getById(id));
    }
}
