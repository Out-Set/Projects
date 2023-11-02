package com.project.blogappapis.Repository;

import com.project.blogappapis.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
