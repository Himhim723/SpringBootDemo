package com.stock.demostocks.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.stock.demostocks.entity.Stock;
import com.stock.demostocks.entity.StockPrice;

@RequestMapping(value = "/api/v1")
public interface DataController  {

  @GetMapping(value = "/data/stock")
  List<Stock> findAll();

  @PostMapping(value = "/data/stock")
  @ResponseStatus(value = HttpStatus.OK)
  Stock save(@RequestBody Stock stock);

  @DeleteMapping(value = "/data/stock")
  @ResponseStatus(value = HttpStatus.OK)
  void deleteById(@RequestParam Long id);

  @DeleteMapping(value = "/data/stock/deleteAll")
  void deleteAll();

  /**
   * @param id    : correct data according to this parameter. Make Sure this id is the same as stock id
   * @param stock : Amended data you want to update
   * @return : the updated value of the Stock
   */
  @PutMapping(value = "/data/stock/{id}")
  @ResponseStatus(value = HttpStatus.OK)
  Stock update (@PathVariable Long id, @RequestBody Stock stock);

  @PatchMapping(value = "/data/stock/{id}/{name}")
  @ResponseStatus(value = HttpStatus.OK)
  Stock updateCompanyName(@PathVariable Long id, @PathVariable String name);

  @PostMapping(value = "/data/stock/save")
  Stock saveFromObject(@RequestParam String symbol);


}
