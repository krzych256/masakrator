package com.game.masakrator.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.game.masakrator.dao.UserRepository;
import com.game.masakrator.model.User;

//@Controller
public class MainController {
/*
	@Autowired
	private UserRepository userRepository;
	
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	//@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> getUser() {
		return userRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		userRepository.save(user);
	}*/
}
