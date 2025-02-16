package com.naseer.deployableapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloController {

    @GetMapping("/hello")
    public String helloApi(){
        return "<h1>Hello World</h1>";
    }
}
