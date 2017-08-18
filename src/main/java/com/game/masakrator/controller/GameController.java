package com.game.masakrator.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.game.masakrator.dao.GameRepository;
import com.game.masakrator.dao.TownRepository;
import com.game.masakrator.dao.UserRepository;
import com.game.masakrator.model.Town;
import com.game.masakrator.model.User;
import com.game.masakrator.security.JwtTokenUtil;
import com.game.masakrator.security.JwtUser;
import com.game.masakrator.service.GameService;

@RestController
public class GameController {

	@Autowired
	private GameService gameService;
	
	@Autowired
	private TownRepository townRepository;
		
	@RequestMapping(path = "/town", method = RequestMethod.GET)
	public Town getOneTown() {		
		return gameService.getAllDateForFirstLogin();
	}
	
	@RequestMapping(path = "/townUser", method = RequestMethod.GET)
	public List<Town> getSelectedTown(HttpServletRequest request) {
		String token = request.getHeader(tokenHeader);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        
        //find idtown where userid=2        
        //find town where townid = up
        
		
		return townRepository.townusera();
				//gameService.getAllDateForFirstLogin();
	}
	
	
	
	
	@Autowired
	private GameRepository gameRepository;
		
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(path = "/usero", method = RequestMethod.GET)
	public List<User> getOneasown() {		
		return userRepository.findAll();
	}
	
	//testowanko
	@Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    	
	@RequestMapping(path = "/userid", method = RequestMethod.GET)
	public String getOneasowsasn(HttpServletRequest request) {
		String token = request.getHeader(tokenHeader);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        User user = userRepository.findByUsername(username);
		String idusera = user.getId().toString();
		
		return idusera;
	}
	
	
	//@RequestMapping(path = "/town", method = RequestMethod.GET)
    public List<Town> getGames() {
        return gameRepository.findAll();
    }
	
	/*
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
	}*/
}
