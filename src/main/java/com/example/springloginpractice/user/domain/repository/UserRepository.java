package com.example.springloginpractice.user.domain.repository;

import com.example.springloginpractice.user.domain.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
