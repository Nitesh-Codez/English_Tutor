package com.example.demoweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Apiclass {
    @GetMapping("/apicheck")
    public String Apiclass() {
        return "ok";
    }
}
