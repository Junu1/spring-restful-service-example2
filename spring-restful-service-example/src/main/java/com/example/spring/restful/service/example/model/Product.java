package com.example.spring.restful.service.example.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    int id;
    private String pname;
    private int batchNo;
    private double price;
    private int noOfProduct;

}
