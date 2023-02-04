package com.yuzarsif.eticaret.repository;

import com.yuzarsif.eticaret.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
