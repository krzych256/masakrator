package com.game.masakrator.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.game.masakrator.model.Town;

public interface TownRepository extends JpaRepository<Town, Long> {

	@Query("SELECT u FROM Town u")// u WHERE ID IN (SELECT TOWN_ID FROM USER_TOWNS WHERE USER_ID = 2)")
	public List<Town> townusera();
}
