package com.restoproject.Restaurant;

import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, Integer> {

    public User findByEmailAndPassword(String email, String password);

}
