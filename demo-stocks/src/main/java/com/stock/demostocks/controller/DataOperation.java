package com.stock.demostocks.controller;

import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stock.demostocks.Repository.StockRepository;
import com.stock.demostocks.entity.Stock;
import com.stock.demostocks.entity.StockPrice;
import com.stock.demostocks.exception.BusinessException;
import com.stock.demostocks.exception.FinnhubException;
import com.stock.demostocks.model.enums.Code;
import com.stock.demostocks.service.DataService;

import jakarta.transaction.Transactional;

@RestController
public class DataOperation implements DataController {

  @Autowired
  private DataService dataService;

  @Override
  public Stock save(Stock entity) {
    return dataService.save(entity);
  }

  @Override
  public void deleteById(Long id) {
    dataService.deleteById(id);
  }

  @Override
  public List<Stock> findAll() {
    return dataService.findAll();
  }

  @Override
  public Stock update (Long id, Stock stock){
    if(id!=stock.getId()) throw new IllegalStateException();
    return dataService.update(id,stock);
  }

  @Override
  public Stock updateCompanyName(Long id, String name) {
    return dataService.updateCompanyName(id,name);
  }

  @Override
  public void deleteAll() {
    dataService.deleteAll();
  }

  @Override
  public Stock saveFromObject(String symbol) {
    return dataService.saveFromObject(symbol);
  }




  
  
  
}
