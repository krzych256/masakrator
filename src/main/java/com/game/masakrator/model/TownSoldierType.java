package com.game.masakrator.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TOWNSOLDIERTYPE")
public class TownSoldierType {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;
		
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "TOWN_ID")
	private Town town;
	
	@ManyToOne
	@JoinColumn(name = "SOLDIERTYPE_ID")
	private SoldierType soldierTypes;
	
	@Column(name = "QUANTITY")    
	private int quantity;

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

	public SoldierType getSoldierTypes() {
		return soldierTypes;
	}

	public void setSoldierTypes(SoldierType soldierTypes) {
		this.soldierTypes = soldierTypes;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
}
