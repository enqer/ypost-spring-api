package com.github.enqer.ypost.model;

import java.time.LocalDateTime;

public class Comment {

    private Long id;
    private Long AuthorId;
    private String content;
    private LocalDateTime publishedAt;
    private Long likes;
}
