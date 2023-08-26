package com.github.enqer.ypost.controller;

import com.github.enqer.ypost.model.Post;
import com.github.enqer.ypost.repository.PostRepository;
import com.github.enqer.ypost.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PostController {

    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }


    @GetMapping
    public String welcome(){
        return "Hello, World!";
    }


    @GetMapping("/posts")
    public List<Post> getPosts(){
        return service.getPosts();
    }

    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable Long id){
        return service.getPost(id);
    }

}
