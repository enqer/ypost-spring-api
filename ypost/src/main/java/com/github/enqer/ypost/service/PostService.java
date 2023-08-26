package com.github.enqer.ypost.service;

import com.github.enqer.ypost.model.Post;
import com.github.enqer.ypost.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PostService {
    private final PostRepository postRepository;



    public List<Post> getPosts(){
        return postRepository.findAll();
    }

    public Post getPost(Long id) {
        return postRepository.findById(id).orElseThrow();
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }
}
