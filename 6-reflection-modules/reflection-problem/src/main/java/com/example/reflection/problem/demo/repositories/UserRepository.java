package com.example.reflection.problem.demo.repositories;

import com.example.reflection.problem.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
