package com.example.springloginpractice.user.service;

import com.example.springloginpractice.user.domain.repository.UserRepository;
import com.example.springloginpractice.user.domain.entity.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public long join(String email, String password){
        Users users = new Users();
        users.setEmail(email);
        users.setPassword(password);
        Users createdUsers = userRepository.save(users);
        return createdUsers.getId();
    }

}
