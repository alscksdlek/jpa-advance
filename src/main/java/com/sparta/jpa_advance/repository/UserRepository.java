package com.sparta.jpa_advance.repository;

import com.sparta.jpa_advance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
