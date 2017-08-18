package com.game.masakrator.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TOWN")
public class Town {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "TOWN_BUILDINGS", joinColumns = { @JoinColumn(name = "TOWN_ID") }, inverseJoinColumns = { @JoinColumn(name = "BUILDING_ID") })
	private List<Building> buildings;
			
	//@OneToMany(mappedBy = "pk.town")//(cascade = CascadeType.ALL)//, fetch = FetchType.LAZY, mappedBy = "stock")
	//@JoinTable(name = "ARMY", joinColumns = { @JoinColumn(name = "TOWN_ID") }, inverseJoinColumns = { @JoinColumn(name = "ARMY_ID") })
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "town", cascade=CascadeType.ALL)
	private List<Army> armyDetail;

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

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}

	public List<Army> getArmyDetail() {
		return armyDetail;
	}

	public void setArmyDetail(List<Army> armyDetail) {
		this.armyDetail = armyDetail;
	}
}
