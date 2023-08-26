package com.github.enqer.ypost.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @SequenceGenerator(
            name = "post",
            sequenceName = "post",
            initialValue = 1,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "post"
    )
    private Long id;
    private Long authorId;
    @Column(
            columnDefinition = "TEXT"
    )
    private String content;
    private LocalDateTime publishedAt;
}
