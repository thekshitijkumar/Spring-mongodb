package com.spring.mongodb;

import com.spring.mongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}


	@Autowired
	UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(userRepository.findUserByFirstName("Pokemon"));
	}
}
