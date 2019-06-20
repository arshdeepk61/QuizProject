package com.att.quiz.respository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.att.quiz.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	   public User findByFirstName(String firstName);
	   public List<User> findByAge(int age);
	
}
