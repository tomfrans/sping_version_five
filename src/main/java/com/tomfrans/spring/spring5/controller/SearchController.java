package com.tomfrans.spring.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tomfrans.spring.spring5.services.SearchService;

@Controller
public class SearchController {
	
	private SearchService searchService;	

	public SearchController(SearchService searchService) {
		this.searchService = searchService;
	}


	@RequestMapping("/search")
	public String getSearchBasedOnProfile(Model model){
	 String modelName = searchService.returnSearchPage();
	 model.addAttribute(modelName,searchService.getModel());
	 return modelName;
	}
}
