package com.example.StudentApp.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    @GetMapping("/show")
    public String showPage(){
        return "<h1>Welcome! Spring Boot</h1>";
    }
}
