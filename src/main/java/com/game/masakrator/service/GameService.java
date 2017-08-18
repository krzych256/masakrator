package com.game.masakrator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.game.masakrator.dao.TownRepository;
import com.game.masakrator.model.Town;

@Service
public class GameService {
	
	@Autowired
	private TownRepository townRepository;

	public Town getAllDateForFirstLogin() {
		Town town = townRepository.findOne((long) 1);
		
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		try {
			String json = ow.writeValueAsString(town);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return town;
	}
}
