package com.tomfrans.spring.spring5.services.impl;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.tomfrans.spring.spring5.repositories.PlayerRepository;
import com.tomfrans.spring.spring5.services.SearchService;

@Service
@Profile("player")
public class PlayerSearchServiceImpl implements SearchService {

	private PlayerRepository playerRepository;	
	
	public PlayerSearchServiceImpl(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	@Override
	public String returnSearchPage() {
		return "players";
	}

	@Override
	public List getModel() {
		return (List)playerRepository.findAll();
	}

}
