package com.spring.mongodb.controller;

import com.spring.mongodb.models.User;
import com.spring.mongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }
    @GetMapping("/user/{id}")
    public List<User> getUser(@PathVariable("name")String name)
    {
        return userRepository.findByName(name);
    }

}

