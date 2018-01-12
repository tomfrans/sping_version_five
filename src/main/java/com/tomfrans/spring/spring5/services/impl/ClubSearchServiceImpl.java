package com.tomfrans.spring.spring5.services.impl;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.tomfrans.spring.spring5.repositories.ClubRepository;
import com.tomfrans.spring.spring5.services.SearchService;

@Service
@Profile({"club","default"})
public class ClubSearchServiceImpl implements SearchService{

	private ClubRepository clubRepository;	
	
	public ClubSearchServiceImpl(ClubRepository clubRepository) {
		this.clubRepository = clubRepository;
	}

	@Override
	public String returnSearchPage() {
		return "clubs";
	}

	@Override
	public List getModel() {		
		return (List) clubRepository.findAll();
	}

}
