package com.hyun2.springboot.data.repository.support;

import com.hyun2.springboot.data.entity.Product;

import java.util.List;

public interface ProductRepositoryCustom {

    List<Product> findByName(String name);

}
