package com.example.spring.restful.service.example.controller;

import com.example.spring.restful.service.example.model.Product;
import com.example.spring.restful.service.example.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping(value = "product")
    public List<Product> getProduct() {
        Product product = new Product();
        List<Product> products = productService.findAll();
        return products;
    }

    @PostMapping(value = "product")
    public int getId(@RequestBody Product product) {
        int id = product.getId();
        return id;
    }

    @RequestMapping(value = "exception", method = RequestMethod.GET)
    public String errorMethod() {
        String Pname = null;
        Pname.toLowerCase();
        return Pname;
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    String handleNullPointerException(NullPointerException e){
        log.error(e.getMessage());
        return "Null Pointer Exception";
    }



}