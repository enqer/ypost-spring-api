package com.github.enqer.ypost.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long userId;

    private String name;
    @Column(
            unique = true,
            nullable = false
    )
    private String nickname;
    private String profilePicture;
    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private LocalDate dateCreated;
    private String password;

}
