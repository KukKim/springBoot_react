package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class testController {
    
    @RequestMapping("/test")
    public String test() {
        return "Hello world!";
    }
}
