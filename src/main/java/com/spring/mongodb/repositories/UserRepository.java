package com.spring.mongodb.repositories;

import com.spring.mongodb.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {

    public List<User> findByName(String name);
}
