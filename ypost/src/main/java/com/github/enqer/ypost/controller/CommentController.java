package com.github.enqer.ypost.controller;

import com.github.enqer.ypost.model.Comment;
import com.github.enqer.ypost.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CommentController {

    private final CommentService commentService;


    @GetMapping("/comments/{id}")
    public Comment getCommentById(@PathVariable Long id){
        return commentService.getCommentById(id);
    }
    @PostMapping("/comments")
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment){
        Comment c = commentService.createComment(new Comment(
                null,
                comment.getContent(),
                comment.getPublishedAt(),
                comment.getPost(),
                comment.getUser()
        ));
        return ResponseEntity.status(HttpStatus.CREATED).body(c);
    }
    @PutMapping("/comments/{id}")
    public ResponseEntity<Comment> updateComment(@RequestBody Comment comment, @PathVariable Long id){
        commentService.updateComment(new Comment(
                id,
                comment.getContent(),
                comment.getPublishedAt(),
                comment.getPost(),
                comment.getUser()
        ));
        return ResponseEntity.noContent().build();
    }

}
