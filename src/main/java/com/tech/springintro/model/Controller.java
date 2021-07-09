package com.tech.springintro.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controller {

    @RestController
    public class Service {
        @GetMapping("/hello")
        public String hello(){
            return "Hello world";
        }
    }


}
