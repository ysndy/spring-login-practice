package com.example.springloginpractice.user.domain.entity;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

}
