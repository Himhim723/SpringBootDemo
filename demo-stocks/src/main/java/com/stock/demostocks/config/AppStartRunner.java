package com.stock.demostocks.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.stereotype.Component;

import com.stock.demostocks.entity.Stock;
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
  public void run(String... args) throws Exception {
    //Before Server Start -> 
    //Get CompanyProfile 2 and insert into database
    List<StockSymbol> s = companyService.getSymbols();
    for(int i=0;i<50;i++){
      try{
      Stock temp = dataService.saveFromObject(s.get(i).getSymbol());
      dataService.saveStockPrice(s.get(i).getSymbol(),temp);
      }catch(Exception e){
        System.out.println("Symbol: "+s.get(i).getSymbol());
      }
    }
  }
}
