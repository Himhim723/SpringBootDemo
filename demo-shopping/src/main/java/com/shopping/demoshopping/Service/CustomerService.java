package com.shopping.demoshopping.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class CustomerService implements CustomerServiceImp{

  @Autowired
  private RestTemplate restTemplate;

  
  
}
