package com.codegym.service;


import com.codegym.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> findAll() {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Product 01", 5000d, "Red", ""));
        products.add(new Product(2, "Product 02", 6000d, "Red", ""));
        products.add(new Product(3, "Product 03", 7000d, "Red", ""));
        products.add(new Product(4, "Product 04", 8000d, "Red", ""));
        products.add(new Product(5, "Product 05", 0000d, "Red", ""));

        return products;
    }

    @Override
    public Product save(Product product) {
        return null;
    }
}
