package com.tomfrans.spring.spring5.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface SearchService {
  
  public String returnSearchPage();
  
  public List getModel();
}
