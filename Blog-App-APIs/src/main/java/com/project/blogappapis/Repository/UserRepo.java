package com.project.blogappapis.Repository;

import com.project.blogappapis.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {

    // for security
    Optional<User> findByEmail(String email);
}
