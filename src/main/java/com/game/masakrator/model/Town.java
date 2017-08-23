package com.game.masakrator.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TOWN")
public class Town {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@JsonIgnore
	private Long id;
		
	@Column(name = "NAME", length = 50)
    @NotNull
    @Size(min = 4, max = 50)
	private String name;
	
	@Column(name = "POINTS")        
	private int points;
	
	@Column(name = "POINTX")        
	private int pointX;
	
	@Column(name = "POINTY")        
	private int pointY;
	
	@Column(name = "IRON")        
	private int iron;
	
	@Column(name = "WOOD")        
	private int wood;
	
	@Column(name = "CLAY")       
	private int clay;
	
	@Column(name = "MANA")    
	private int mana;
	
	@OneToMany(mappedBy="town")
	private List<TownBuilding> buildings;
			
	@OneToMany(mappedBy = "town")
	private List<TownSoldierType> townSoldierTypes;
	
	@JsonIgnore
	@OneToMany(mappedBy = "town")
	private List<UserTown> userTowns;

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

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getPointX() {
		return pointX;
	}

	public void setPointX(int pointX) {
		this.pointX = pointX;
	}

	public int getPointY() {
		return pointY;
	}

	public void setPointY(int pointY) {
		this.pointY = pointY;
	}

	public int getIron() {
		return iron;
	}

	public void setIron(int iron) {
		this.iron = iron;
	}

	public int getWood() {
		return wood;
	}

	public void setWood(int wood) {
		this.wood = wood;
	}

	public int getClay() {
		return clay;
	}

	public void setClay(int clay) {
		this.clay = clay;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public List<TownBuilding> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<TownBuilding> buildings) {
		this.buildings = buildings;
	}

	public List<TownSoldierType> getTownSoldierTypes() {
		return townSoldierTypes;
	}

	public void setTownSoldierTypes(List<TownSoldierType> townSoldierTypes) {
		this.townSoldierTypes = townSoldierTypes;
	}

	public List<UserTown> getUserTowns() {
		return userTowns;
	}

	public void setUserTowns(List<UserTown> userTowns) {
		this.userTowns = userTowns;
	}
	
}
