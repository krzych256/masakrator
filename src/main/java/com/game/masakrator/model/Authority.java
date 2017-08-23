package com.game.masakrator.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "AUTHORITY")
public class Authority {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    @NotNull
    @Enumerated(EnumType.STRING)
    private AuthorityName name;

    @OneToMany(mappedBy = "authority", fetch = FetchType.LAZY)
    private List<UserAuthority> authoritis;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AuthorityName getName() {
		return name;
	}

	public void setName(AuthorityName name) {
		this.name = name;
	}

	public List<UserAuthority> getAuthoritis() {
		return authoritis;
	}

	public void setAuthoritis(List<UserAuthority> authoritis) {
		this.authoritis = authoritis;
	}
}