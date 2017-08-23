package com.game.masakrator.model;

import java.util.Date;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "[USER]")
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "USERNAME", length = 50, unique = true)
    @NotNull
    @Size(min = 4, max = 50)
    private String username;

    @Column(name = "PASSWORD", length = 100)
    @NotNull
    @Size(min = 4, max = 100)
    private String password;

    @Column(name = "EMAIL", length = 50)
    @NotNull
    @Size(min = 4, max = 50)
    @Email
    private String email;

    @Column(name = "ENABLED")
    @NotNull
    private Boolean enabled;

    @Column(name = "LASTPASSWORDRESETDATE")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date lastPasswordResetDate;

    @OneToMany(mappedBy="user", fetch = FetchType.EAGER)
	private List<UserAuthority> authoritis;
    
    @OneToMany(mappedBy="user")
	private List<UserTown> userTowns;
    
    @Column(name = "PREMIUM")
    private int premium;
    
    @Column(name = "ALLPOINTS")
	private int allPoints;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Date getLastPasswordResetDate() {
		return lastPasswordResetDate;
	}

	public void setLastPasswordResetDate(Date lastPasswordResetDate) {
		this.lastPasswordResetDate = lastPasswordResetDate;
	}

	public List<UserAuthority> getAuthoritis() {
		return authoritis;
	}

	public void setAuthoritis(List<UserAuthority> authoritis) {
		this.authoritis = authoritis;
	}

	public List<UserTown> getUserTowns() {
		return userTowns;
	}

	public void setUserTowns(List<UserTown> userTowns) {
		this.userTowns = userTowns;
	}

	public int getPremium() {
		return premium;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}

	public int getAllPoints() {
		return allPoints;
	}

	public void setAllPoints(int allPoints) {
		this.allPoints = allPoints;
	}
        
}