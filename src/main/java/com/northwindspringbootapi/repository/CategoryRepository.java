package com.northwindspringbootapi.repository;

import com.northwindspringbootapi.entity.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository   {

    List<Category> findAll();
    Optional<Category> findById(Integer id);
    int save(Category entity);
    int update(Category entity);
    int deleteById(Integer id);
}
