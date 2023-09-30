package com.stock.demostocks.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.stock.demostocks.model.Company2;

@Service
public class StockRestTemplate {
  
  @Autowired
  RestTemplate restTemplate;

  public Company2 getProfile(String symbol){
    // call restTemplate getforObject
    return restTemplate.getForObject("xxx", Company2.class);
  }
}
