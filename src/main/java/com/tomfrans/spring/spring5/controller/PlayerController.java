package com.tomfrans.spring.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tomfrans.spring.spring5.repositories.PlayerRepository;

@Controller
public class PlayerController {

	private PlayerRepository playerRepository;

	public PlayerController(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}
	
	@RequestMapping("/players")
	public String getPlayers(Model model){
		model.addAttribute("players",playerRepository.findAll());
		return "players";
	}
}
