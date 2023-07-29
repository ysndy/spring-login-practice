package com.example.springloginpractice.user.controller;

import com.example.springloginpractice.user.dto.UserJoinRequestDto;
import com.example.springloginpractice.user.dto.UserJoinResponseDto;
import com.example.springloginpractice.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<UserJoinResponseDto> createUser(@RequestBody UserJoinRequestDto requestDto){
        UserJoinResponseDto responseDto = new UserJoinResponseDto();
        responseDto.setId(userService.join(requestDto.getEmail(), requestDto.getPassword()));
        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
    }

}
