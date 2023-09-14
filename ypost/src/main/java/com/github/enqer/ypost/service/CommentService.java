package com.github.enqer.ypost.service;

import com.github.enqer.ypost.model.Comment;
import com.github.enqer.ypost.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentService {

    public final CommentRepository repository;

    public List<Comment> getCommentsByPostId(Long id) {
        return repository.findAllByPostId(id);
    }

    public Comment getCommentById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
