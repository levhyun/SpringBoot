package com.hyun2.springboot.data.repository;

import com.hyun2.springboot.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
