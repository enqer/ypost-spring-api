package com.github.enqer.ypost.controller;

import com.github.enqer.ypost.model.Post;
import com.github.enqer.ypost.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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

    @PostMapping("/posts")
    public ResponseEntity<Post> createPost(@RequestBody Post post){
        service.createPost(post);
        Post newPost = service.createPost(new Post(
            null,
                post.getAuthorId(),
                post.getContent(),
                LocalDateTime.now())
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }

    @PutMapping("/posts/{id}")
    public ResponseEntity<Object> updatePost(@RequestBody Post post, @PathVariable Long id){
        service.updatePost(new Post(
                id,
                post.getAuthorId(),
                post.getContent(),
                post.getPublishedAt()
        ));
        return ResponseEntity.noContent().build();
    }


}
