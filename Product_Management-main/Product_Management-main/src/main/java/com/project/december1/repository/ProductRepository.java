package com.project.december1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.december1.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
