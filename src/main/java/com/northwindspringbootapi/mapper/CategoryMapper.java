package com.northwindspringbootapi.mapper;

import com.northwindspringbootapi.dto.CategoryDTO;
import com.northwindspringbootapi.entity.Category;
import com.northwindspringbootapi.model.CategoryModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDTO toDto(CategoryModel model);

    CategoryModel toModel(CategoryDTO dto);

    CategoryModel entityToModel(Category entity);

    Category modelToEntity(CategoryModel model);
}
