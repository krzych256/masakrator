package com.game.masakrator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.game.masakrator.dao.UserRepository;
import com.game.masakrator.dao.UserTestRepository;
import com.game.masakrator.model.User;
import com.game.masakrator.model.UserTest;

//@RestController
//@RequestMapping("/user")
public class UserTestRestContoroller {
/*
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserTestRepository userTestRepository;

	// @RequestMapping(method = RequestMethod.GET)
	public List<User> getUser() {
		User us = new User();
		us.setAllPoints(100);
		us.setEmail("jakis@ow.pl");
		us.setName("namwe");
		us.setPassword("passwor");
		us.setPremiumPoints(10);
		userRepository.save(us);

		return userRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<UserTest> getUsersTest() {
		
		UserTest ut = new UserTest();
		ut.setFirstName("firstName");
		ut.setLastName("lastName");
		ut.setPassword("password");
		ut.setUsername("username");
		userTestRepository.save(ut);

		return userTestRepository.findAll();
	}
	
	//@RequestMapping(method = RequestMethod.GET)
	public UserTest getUserTest(String nazwa) {
		
		UserTest ut = new UserTest();
		ut.setFirstName("firstName");
		ut.setLastName("lastName");
		ut.setPassword("password");
		ut.setUsername("username");
		userTestRepository.save(ut);

		return userTestRepository.findOne(nazwa);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		userRepository.save(user);
	}*/
}
