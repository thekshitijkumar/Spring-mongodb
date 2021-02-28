package com.spring.mongodb.repositories;

import com.spring.mongodb.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {

    public List<User> findByName(String name);

    //custom query only similar to native can exist
    @Query("{age:{$gte: ?0}}")
    public List<User> findUserByAge(int age);

    @Query("{name: ?0}")
    public List<User> findUserByFirstName(String name);
}
