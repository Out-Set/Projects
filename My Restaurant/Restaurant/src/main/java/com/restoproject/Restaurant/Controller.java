package com.restoproject.Restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class Controller {

    @Autowired
    private Repository repository;

    @GetMapping("/user")
    public List<User> get(){
        return repository.findAll();
    }

    @GetMapping("/byEmailAndPass")
    public User getUserByEmailAndPassword(@RequestParam String email, @RequestParam String password){
        return repository.findByEmailAndPassword(email, password);
    }

    @PostMapping("/user")
    public User post(@RequestBody User user){
        return repository.save(user);
    }
}
