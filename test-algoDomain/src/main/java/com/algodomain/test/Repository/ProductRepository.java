package com.algodomain.test.Repository;

import com.algodomain.test.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByProductId(int id);
}
