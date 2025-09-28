package com.example.demo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class HealthController
{
    @GetMapping("/health")
    public String health()
    {
        System.out.println("Health method");
        return "OK";
    }
}
