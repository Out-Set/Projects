package com.project.blogappapis.Services;

import com.project.blogappapis.Payloads.CategoryDto;

import java.util.List;

public interface CategoryService {

    // Create
    public CategoryDto createCategory(CategoryDto categoryDto);

    // Update
    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

    // Delete
    void deleteCategory(Integer categoryId);

    // Get
    CategoryDto getCategory(Integer categoryId);

    // Get All
    List<CategoryDto> getCategories();
}
