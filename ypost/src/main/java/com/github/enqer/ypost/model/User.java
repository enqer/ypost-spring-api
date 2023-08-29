package com.github.enqer.ypost.model;

import java.time.LocalDate;
import java.util.List;

public class User {

    private Long id;
    private String name;
    private String nickname;
    private String profilePicture;
    private String email;
    private LocalDate dateCreated;
    private String password;
    private List<Post> posts; // ?????
}
