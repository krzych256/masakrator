package com.game.masakrator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.game.masakrator.model.User;
import com.game.masakrator.service.UserService;

@RestController
public class MainController {
		
	@Autowired
	private UserService userService;
	
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public void addUser2(@RequestBody User user) {				
		userService.addUser(user);		
	}
	

}
