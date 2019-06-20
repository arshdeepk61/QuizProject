package com.att.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.att.quiz.model.User;
import com.att.quiz.service.UserService;



@ComponentScan
@RestController
@EnableAutoConfiguration
public class UserController {

	@Autowired
	private com.att.quiz.service.UserService UserService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age) {
		User p = UserService.create(firstName, lastName, age);
		return p.toString();
	}
	
	@RequestMapping("/get")
	public User getUser(@RequestParam String firstName) {
		return UserService.getByFirstName(firstName);
	}
	@RequestMapping("/getAll")
	public List<User> getAll(){
		return UserService.getAll();
	}
	@RequestMapping("/update")
	public String update(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age) {
		User p = UserService.update(firstName, lastName, age);
		return p.toString();
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam String firstName) {
		UserService.delete(firstName);
		return "Deleted "+firstName;
	}
	@RequestMapping ("/deleteAll")
	public String deleteAll() {
		UserService.deleteAll();
		return "Deleted all records";
	}
	
	@RequestMapping ("/")
	public String test() {
		return "Testing completed";
	}
}
