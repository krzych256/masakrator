package com.game.masakrator.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TOWNBUILDING")
public class TownBuilding {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="TOWN_ID")
	private Town town;
	
	@ManyToOne
	@JoinColumn(name="BUILDING_ID")
	private Building building;
	
	@Column(name = "LEVEL")  
	private int level;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
