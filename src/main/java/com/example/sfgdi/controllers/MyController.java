package com.example.sfgdi.controllers;

import org.springframework.stereotype.Component;

@Component
public class MyController {
    public String sayHello() {
        System.out.println("Hello, World!");
        return "Greeting";
    }
}
