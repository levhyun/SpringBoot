package com.hyun2.springboot.data.repository;

import com.hyun2.springboot.data.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
