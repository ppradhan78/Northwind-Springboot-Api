package com.northwindspringbootapi.services;
import com.northwindspringbootapi.dto.CategoryDTO;
import com.northwindspringbootapi.entity.Category;
import com.northwindspringbootapi.mapper.CategoryMapper;
import com.northwindspringbootapi.model.CategoryModel;
import com.northwindspringbootapi.repository.CategoryRepository;
import com.northwindspringbootapi.services.impl.CategoryServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CategoryServiceImplTest {

    @Mock
    private CategoryRepository repository;

    @Mock
    private CategoryMapper categoryMapper;

    @InjectMocks
    private CategoryServiceImpl service;

    @Test
    void getAllCategories_ShouldReturnCategoryDTOList() {
        // Arrange
        Category entity1 = Category.builder().categoryId(1).categoryName("Beverages").build();
        Category entity2 = Category.builder().categoryId(2).categoryName("Condiments").build();

        CategoryModel model1 = CategoryModel.builder().categoryId(1).categoryName("Beverages").build();
        CategoryModel model2 = CategoryModel.builder().categoryId(2).categoryName("Condiments").build();

        CategoryDTO dto1 = CategoryDTO.builder().categoryId(1).categoryName("Beverages").build();
        CategoryDTO dto2 = CategoryDTO.builder().categoryId(2).categoryName("Condiments").build();

        when(repository.findAll()).thenReturn(Arrays.asList(entity1, entity2));
        when(categoryMapper.entityToModel(entity1)).thenReturn(model1);
        when(categoryMapper.entityToModel(entity2)).thenReturn(model2);
        when(categoryMapper.toDto(model1)).thenReturn(dto1);
        when(categoryMapper.toDto(model2)).thenReturn(dto2);

        // Act
        List<CategoryDTO> result = service.getAllCategories();

        // Assert
        assertThat(result).hasSize(2);
        assertThat(result.get(0).getCategoryName()).isEqualTo("Beverages");
        assertThat(result.get(1).getCategoryName()).isEqualTo("Condiments");

        verify(repository, times(1)).findAll();
        verify(categoryMapper, times(2)).entityToModel(any());
        verify(categoryMapper, times(2)).toDto(any());
    }
}


