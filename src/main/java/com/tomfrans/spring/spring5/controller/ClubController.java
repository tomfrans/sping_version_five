package com.tomfrans.spring.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tomfrans.spring.spring5.repositories.ClubRepository;

@Controller
public class ClubController {

	private ClubRepository clubRepository;

	public ClubController(ClubRepository clubRepository) {
		super();
		this.clubRepository = clubRepository;
	}
	
	@RequestMapping("/clubs")
	public String getClubs(Model model){
		model.addAttribute("clubs",clubRepository.findAll());
		return "clubs";
	}
}
