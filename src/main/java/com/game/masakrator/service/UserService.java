package com.game.masakrator.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.game.masakrator.dao.UserRepository;
import com.game.masakrator.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public void addUser(User user) {
		
		User userNew = new User();
		
		userNew.setUsername(user.getUsername());
		userNew.setPassword(passwordEncoder.encode(user.getPassword()));
		userNew.setEmail(user.getEmail());
		userNew.setEnabled(true);
		userNew.setLastPasswordResetDate(new Date());
		userRepository.save(userNew);
		
	}

	private void createNewTown() {
		
	}
}
