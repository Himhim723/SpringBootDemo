package com.stock.demostocks.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.stock.demostocks.entity.Stock;
import com.stock.demostocks.entity.StockPrice;

public interface DataService {

  List<Stock> findAll();
  Stock save(Stock stock);
  void deleteById(Long id);
  Stock update (Long id,Stock stock);
  Stock updateCompanyName( Long id,  String name);
  void deleteAll();
  /**
   * Controller call this method, method extract json from the url (others api)
   * convert to Stock Object and then save it in the repository
   * @param symbol For construct the 
   * url = www.finnhub.io/stock?symbol= {TSLA(Request Parameter)} &token=........
   * @return Saved Object
   */
  Stock saveFromObject(String symbol);
  StockPrice saveStockPrice (String symbol,Stock stock);

}
