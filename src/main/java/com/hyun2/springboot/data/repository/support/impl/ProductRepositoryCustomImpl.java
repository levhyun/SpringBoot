package com.hyun2.springboot.data.repository.support.impl;

import com.hyun2.springboot.data.entity.Product;
import com.hyun2.springboot.data.entity.QProduct;
import com.hyun2.springboot.data.repository.support.ProductRepositoryCustom;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class ProductRepositoryCustomImpl extends QuerydslRepositorySupport implements ProductRepositoryCustom {

    public ProductRepositoryCustomImpl() {
        super((Product.class));
    }

    @Override
    public List<Product> findByName(String name) {
        QProduct product = QProduct.product;

        List<Product> productList = from(product)
                .where(product.name.eq(name))
                .select(product)
                .fetch();

        return productList;
    }

}
