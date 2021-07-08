package com.tech.springintro.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }
}

