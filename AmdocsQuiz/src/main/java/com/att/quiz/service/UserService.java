package com.att.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.att.quiz.model.User;
import com.att.quiz.respository.UserRepository;

@Service
public class UserService {
   
	@Autowired
	private UserRepository UserRepository;
	
	//Create operation
	public User create(String firstName,String lastName, int age) {
		return UserRepository.save(new User(firstName, lastName, age));
	}
	//Retrieve operation
	public List<User> getAll(){
		return UserRepository.findAll();
	}
	public User getByFirstName(String firstName) {
		return UserRepository.findByFirstName(firstName);
	}
	//Update operation
	public User update(String firstName, String lastName, int age) {
		User p = UserRepository.findByFirstName(firstName);
		p.setLastName(lastName);
		p.setAge(age);
		return UserRepository.save(p);
	}
	//Delete operation
	public void deleteAll() {
		UserRepository.deleteAll();
	}
	public void delete(String firstName) {
		User p = UserRepository.findByFirstName(firstName);
		UserRepository.delete(p);
	}
}
