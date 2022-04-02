package com.example.spring.restful.service.example.service;

import com.example.spring.restful.service.example.model.Product;

import java.util.List;

public interface IProductService {
    List <Product> findAll();
    public int getId();
    public String errorMethod();
    public int deleteId();
}
