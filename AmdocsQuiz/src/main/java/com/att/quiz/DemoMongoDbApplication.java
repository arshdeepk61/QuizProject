package com.att.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.att.quiz.respository.UserRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@ComponentScan
@EnableAutoConfiguration
public class DemoMongoDbApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoMongoDbApplication.class, args);
	
	}
}
