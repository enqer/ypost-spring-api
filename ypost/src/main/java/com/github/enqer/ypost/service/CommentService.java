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

    
}
