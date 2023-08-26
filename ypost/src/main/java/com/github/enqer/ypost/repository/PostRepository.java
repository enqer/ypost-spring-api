package com.github.enqer.ypost.repository;

import com.github.enqer.ypost.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
