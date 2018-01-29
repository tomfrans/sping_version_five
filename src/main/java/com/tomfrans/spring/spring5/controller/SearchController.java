package com.tomfrans.spring.spring5.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tomfrans.spring.spring5.services.SearchService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class SearchController {
	
	private SearchService searchService;
	
	@Value("${title}")
	private String title;

	public SearchController(SearchService searchService) {
		this.searchService = searchService;
	}


	@RequestMapping("/search")
	public String getSearchBasedOnProfile(Model model){
	 String modelName = searchService.returnSearchPage();
	 model.addAttribute(modelName,searchService.getModel());
	 log.info("Searched info is for :"+title);
	 model.addAttribute("title",title);
	 return modelName;
	}

}
