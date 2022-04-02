package com.example.spring.restful.service.example.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {
    private int id;
    private String name;
}
