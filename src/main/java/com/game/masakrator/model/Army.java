package com.game.masakrator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Army {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private KindOfSoldier kindOfSoldier;
	
	private int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public KindOfSoldier getKindOfSoldier() {
		return kindOfSoldier;
	}

	public void setKindOfSoldier(KindOfSoldier kindOfSoldier) {
		this.kindOfSoldier = kindOfSoldier;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
