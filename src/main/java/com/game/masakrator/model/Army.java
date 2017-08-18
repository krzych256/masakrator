package com.game.masakrator.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "ARMY")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonAutoDetect(getterVisibility=JsonAutoDetect.Visibility.NONE)
public class Army {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@JsonProperty
	private int id;
		
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TOWN_ID")
	private Town town;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SOLDIERTYPE_ID")
	//@JsonProperty
	private SoldierType soldierTypeArmyDetail;
	
	@Column(name = "QUANTITY")    
	//@JsonProperty
	private int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SoldierType getSoldierTypeArmyDetail() {
		return soldierTypeArmyDetail;
	}

	public void setSoldierTypeArmyDetail(SoldierType soldierTypeArmyDetail) {
		this.soldierTypeArmyDetail = soldierTypeArmyDetail;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}


	
}
