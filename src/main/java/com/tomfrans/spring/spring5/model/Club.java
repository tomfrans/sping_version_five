package com.tomfrans.spring.spring5.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Club implements BaseModel{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	private String name;
	private String homeground;
	
	@OneToOne
	private Manager manager;
	
	@ManyToMany
	@JoinTable(name="Club_Player" ,
	joinColumns = { @JoinColumn(name = "club_id") }, 
	inverseJoinColumns = { @JoinColumn(name = "player_id")})
	private List<Player> players = new ArrayList<Player>();
	
	
	
	public Club() {
		
	}


	public Club(String name, String homeground) {
		this.name = name;
		this.homeground = homeground;
	}
	
	
	public Club(String name, String homeground, List<Player> players) {
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

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Club other = (Club) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Club [id=" + id + ", name=" + name + ", homeground=" + homeground + ", players=" + players + "]";
	}


	public Manager getManager() {
		return manager;
	}


	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	
	
}
