package com.stock.demostocks.config;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.stereotype.Component;

import com.stock.demostocks.entity.Stock;
import com.stock.demostocks.entity.StockPrice;
import com.stock.demostocks.exception.FinnhubException;
import com.stock.demostocks.model.Quote;
import com.stock.demostocks.model.StockSymbol;
import com.stock.demostocks.service.CompanyService;
import com.stock.demostocks.service.DataService;

@Component
public class AppStartRunner implements CommandLineRunner{

  @Autowired
  private DataService dataService;
  @Autowired
  private CompanyService companyService;


  @Override
  public void run(String... args) throws FinnhubException {
    
    //Programmer
    //Carmeego 
    //22000-25000
    //mid of October
    //手寫 Code Test 

  }
}
