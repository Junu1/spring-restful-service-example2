package com.example.spring.restful.service.example.service;

import com.example.spring.restful.service.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Override
    public List<Product> findAll() {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "DELL", 101, 20000.0, 5));
        products.add(new Product(2, "hP", 102, 30000, 10));
        products.add(new Product(3, "Mac", 103, 3000000, 15));
        return products;
    }

    @Override
    public int getId() {
        Product product = new Product();
        return product.getId();
    }

    @Override
    public String errorMethod() {
        Product product1 = new Product();
        String name = product1.getPname();
        return name;
    }

    @Override
    public int deleteId() {
        return 0;
    }
}

