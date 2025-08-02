package com.northwindspringbootapi.services;

import com.northwindspringbootapi.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryById(Integer id);
    void createCategory(CategoryDTO dto);
    void updateCategory(Integer id, CategoryDTO dto);
    void deleteCategory(Integer id);
}
