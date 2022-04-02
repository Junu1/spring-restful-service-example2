package com.example.spring.restful.service.example.controller;

import com.example.spring.restful.service.example.model.Product;
import com.example.spring.restful.service.example.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@Slf4j
@RestController
@RequestMapping(value = "users")
public class UserController {
    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> createUser(@RequestBody User user) {
        user.setId(1);
        HttpHeaders headers = new HttpHeaders();
        headers.add("token", String.valueOf(user.getId()));
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{userId}")
    public ResponseEntity<User> getUser(@PathVariable int id) {
        User user = User.builder()
                .id(1)
                .name("Junu")
                .build();
        return ResponseEntity.ok(user);
    }
        }

