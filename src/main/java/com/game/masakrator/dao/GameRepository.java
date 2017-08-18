package com.game.masakrator.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.masakrator.model.Town;

public interface GameRepository extends JpaRepository<Town, Long> {


}
