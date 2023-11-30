package com.github.enqer.ypost.service;

import com.github.enqer.ypost.model.Comment;
import com.github.enqer.ypost.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CommentService {

    public final CommentRepository repository;

    public List<Comment> getCommentsByPostId(Long id) {
        return repository.findAll()
                .stream()
                .filter(p -> p.getPost().getPostId().equals(id))
                .collect(Collectors.toList());
    }

    public Comment getCommentById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Comment createComment(Comment comment) {
        return repository.save(comment);
    }

    public void updateComment(Comment comment) {
        repository.save(comment);
    }

    public void deleteComment(Long id) {
        repository.deleteById(id);
    }
}
