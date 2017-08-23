package com.game.masakrator.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "BUILDING")
public class Building {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;
	
	@Column(name = "NAME")    
	private String name;
		
	@Column(name = "DESCRIPTION")    
	private String description;
	
	@JsonIgnore
	@OneToMany(mappedBy="building")
	private List<TownBuilding> buildings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<TownBuilding> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<TownBuilding> buildings) {
		this.buildings = buildings;
	}
}
