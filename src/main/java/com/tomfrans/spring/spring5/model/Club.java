package com.tomfrans.spring.spring5.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Club {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	private String name;
	private String homeground;
	
	@ManyToMany
	@JoinTable(name="Club_Player" ,
	joinColumns = { @JoinColumn(name = "club_id") }, 
	inverseJoinColumns = { @JoinColumn(name = "player_id")})
	private Set<Player> players = new HashSet<Player>();
	
	
	
	public Club() {
		
	}


	public Club(String name, String homeground) {
		this.name = name;
		this.homeground = homeground;
	}
	
	
	public Club(String name, String homeground, Set<Player> players) {
		this.name = name;
		this.homeground = homeground;
		this.players = players;
	}

	

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

	public String getHomeground() {
		return homeground;
	}

	public void setHomeground(String homeground) {
		this.homeground = homeground;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	
}
