package com.example.demoweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class Hello {

    @GetMapping("/hello")
    public Map<String, Object> sayHello() {
        return Map.of(
                "message", "Hello REST API!",
                "status", "OK"
        );
    }
}