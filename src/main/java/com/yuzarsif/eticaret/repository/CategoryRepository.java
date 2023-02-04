package com.yuzarsif.eticaret.repository;

import com.yuzarsif.eticaret.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
