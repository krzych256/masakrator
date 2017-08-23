package com.game.masakrator.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "SOLDIERTYPE")
public class SoldierType {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;
	
	@Column(name = "NAME")    
	private String name;
	
	@Column(name = "DESCRIPTION")    
	private String description;
	
	@Column(name = "STRENGHT")       
	private int strenght;
	
	@Column(name = "DEFENCE")       
	private int defence;
	
	@Column(name = "HP")
	private int hp;
	
	@Column(name = "SPEED")
	private int speed;

	@JsonIgnore
	@OneToMany(mappedBy="soldierTypes")
	private List<TownSoldierType> soldiers;

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

	public int getStrenght() {
		return strenght;
	}

	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public List<TownSoldierType> getSoldiers() {
		return soldiers;
	}

	public void setSoldiers(List<TownSoldierType> soldiers) {
		this.soldiers = soldiers;
	}
}
