package com.tomfrans.spring.spring5.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	private String lastName;
	private String position;
	
	@ManyToMany(mappedBy = "players")
	private Set<Club> club = new HashSet<Club>();	

	

	public Player() {
		
	}


	public Player(String firstName, String lastName, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
	}
	
	
	public Player(String firstName, String lastName, String position, Set<Club> club) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.club = club;
	}

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Set<Club> getClub() {
		return club;
	}

	public void setClub(Set<Club> club) {
		this.club = club;
	}
	
	
}
