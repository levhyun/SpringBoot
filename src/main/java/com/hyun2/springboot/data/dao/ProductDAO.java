package com.hyun2.springboot.data.dao;

import com.hyun2.springboot.data.entity.Product;

public interface ProductDAO {

    Product insetProduct(Product product);

    Product selectProduct(Long number);

    Product updateProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;

}
