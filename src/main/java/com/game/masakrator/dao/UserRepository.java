package com.game.masakrator.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.masakrator.model.User;

public interface UserRepository extends JpaRepository<User, String>{

}
