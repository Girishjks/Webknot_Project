package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class Controller {
    @GetMapping("/Get")
    public String doGet() {
        return "Puru is Gandu";
    }
    @PostMapping("/post")
      public String doPost() {
        return "Puru and pramanth is";
    
    }
}