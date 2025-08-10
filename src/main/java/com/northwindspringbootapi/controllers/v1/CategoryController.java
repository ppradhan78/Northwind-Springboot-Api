package com.northwindspringbootapi.controllers.v1;

import com.northwindspringbootapi.dto.CategoryDTO;
import com.northwindspringbootapi.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService service;

    @PreAuthorize("hasRole('Admin')")
    @GetMapping
    public List<CategoryDTO> getAllCategories() {
        return service.getAllCategories();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO> getCategoryById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getCategoryById(id));
    }

    @PostMapping
    public ResponseEntity<String> createCategory(@RequestBody CategoryDTO dto) {
        service.createCategory(dto);
        return ResponseEntity.ok("Category created successfully");
    }

    @PutMapping("/{id}")
    public Map<String, String> updateCategory(@PathVariable Integer id, @RequestBody CategoryDTO dto) {
       int success= service.updateCategory(id, dto);
       if(success>0){
           return Map.of("message", "Category updated successfully");
       }
       else {
           return Map.of("message", "Faill to Update Category.");
       }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Integer id) {
        service.deleteCategory(id);
        return ResponseEntity.ok("Category deleted successfully");
    }
}

