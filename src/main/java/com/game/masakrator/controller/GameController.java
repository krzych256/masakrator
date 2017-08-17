package com.game.masakrator.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.game.masakrator.model.Town;

@RestController
public class GameController {

	
	
	private static final List<Town> towns;

	static {
		towns = new ArrayList<>();
		
		Town t1 = new Town();
		t1.setId(1);
		t1.setName("name1");
		t1.setPoints(100);
		t1.setPointX(1);
		t1.setPointY(1);
		t1.setIron(100);
		t1.setWood(100);
		t1.setClay(100);
		t1.setMana(100);
		
		Town t2 = new Town();
		t2.setId(2);
		t2.setName("name2");
		t2.setPoints(100);
		t2.setPointX(2);
		t2.setPointY(2);
		t2.setIron(100);
		t2.setWood(100);
		t2.setClay(100);
		t2.setMana(100);
		
		towns.add(t1);
		towns.add(t2);
	}
	
	@RequestMapping(path = "/game/{name}", method = RequestMethod.GET)
	public static Town getTown(@PathVariable("name") String name) {
		return towns.stream()
				.filter(town -> name.equalsIgnoreCase(town.getName()))
				.findAny().orElse(null);
				//persons.stream().filter(person -> name.equalsIgnoreCase(person.getName())).findAny().orElse(null);
	}
	
	@RequestMapping(path = "/game", method = RequestMethod.GET)
    public static List<Town> getGames() {
        return towns;
    }
		
	@RequestMapping("/test")
	public String getPersons() {
		return "test";
	}
}
