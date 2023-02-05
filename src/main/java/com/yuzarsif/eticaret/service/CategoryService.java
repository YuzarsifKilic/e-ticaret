package com.yuzarsif.eticaret.service;

import com.yuzarsif.eticaret.dto.converter.CategoryDtoConvert;
import com.yuzarsif.eticaret.dto.model.CategoryDto;
import com.yuzarsif.eticaret.exception.CategoryNotFoundException;
import com.yuzarsif.eticaret.model.Category;
import com.yuzarsif.eticaret.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryDtoConvert convert;

    public CategoryService(CategoryRepository categoryRepository, CategoryDtoConvert convert) {
        this.categoryRepository = categoryRepository;
        this.convert = convert;
    }

    public List<CategoryDto> getAll() {
        return categoryRepository.findAll().stream().map(convert::convert).collect(Collectors.toList());
    }

    protected Category findById(int id) {
        return categoryRepository
                .findById(id)
                .orElseThrow(
                        () -> new CategoryNotFoundException(id + " ye sahip bir kategori bulunamadı"));
    }

    public List<CategoryDto> getById(int id) {
        return getAll().stream().filter(c -> c.getId() == id).collect(Collectors.toList());
    }
}
