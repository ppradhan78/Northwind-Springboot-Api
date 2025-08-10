package com.northwindspringbootapi.services;

import com.northwindspringbootapi.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryById(Integer id);
    int createCategory(CategoryDTO dto);
    int updateCategory(Integer id, CategoryDTO dto);
    int deleteCategory(Integer id);
}
