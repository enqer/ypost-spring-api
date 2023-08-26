package com.github.enqer.ypost.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class PostController {

    @GetMapping
    public String welcome(){
        return "Hello, World!";
    }
}
