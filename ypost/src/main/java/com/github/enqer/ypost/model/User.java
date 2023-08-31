package com.github.enqer.ypost.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class User {

    @Id
    private Long userId;
    private String name;
    private String nickname;
    private String profilePicture;
    private String email;
    private LocalDate dateCreated;
    private String password;

}
