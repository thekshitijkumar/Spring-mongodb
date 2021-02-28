package com.spring.mongodb.controller;

import com.spring.mongodb.models.User;
import com.spring.mongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/user/{name}")
    public List<User> getUser(@PathVariable("name")String name)
    {
        return userRepository.findByName(name);
    }
    @GetMapping("/userByAge")
    public List<User> getUserForAge(@RequestParam("age") int age)
    {
        return userRepository.findUserByAge(age);
    }
    @PostMapping("/user")
    public void insertUser(@RequestBody User user)
    {
        userRepository.save(user);
    }

}

