package com.algodomain.test.Repository;

import com.algodomain.test.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {

    Category findByProductCategory(String productCategory);
}
