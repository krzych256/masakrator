package com.game.masakrator.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "USERTOWN")
public class UserTown {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="TOWN_ID")
	private Town town;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}	
}
