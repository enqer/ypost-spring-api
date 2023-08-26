package com.github.enqer.ypost.controller;

import com.github.enqer.ypost.model.Post;
import com.github.enqer.ypost.repository.PostRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
public class PostController {

    private final PostRepository repository;

    public PostController(PostRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public String welcome(){
        return "Hello, World!";
    }


    @GetMapping("/posts")
    public List<Post> getPost(){
        return repository.findAll();
    }

}
