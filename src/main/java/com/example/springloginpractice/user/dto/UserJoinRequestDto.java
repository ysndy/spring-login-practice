package com.example.springloginpractice.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserJoinRequestDto {
    private String email;
    private String password;
}
