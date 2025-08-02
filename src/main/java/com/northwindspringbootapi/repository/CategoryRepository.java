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
    void save(Category entity);
    void update(Category entity);
    void deleteById(Integer id);
}
