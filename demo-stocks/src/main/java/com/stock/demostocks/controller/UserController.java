package com.stock.demostocks.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stock.demostocks.APIResponse.ApiResponse;
import com.stock.demostocks.entity.Stock;
import com.stock.demostocks.model.Company2;
import com.stock.demostocks.model.CompanyDTO;
import com.stock.demostocks.model.Quote;
import com.stock.demostocks.model.StockSymbol;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("api/v1")
public interface UserController {

  @GetMapping(value = "/conclude")
  ApiResponse<CompanyDTO> getResult(@RequestParam String symbol);

  // @GetMapping(value = "/stock")
  // Company2 getCompany(@RequestParam String symbol);
  // @GetMapping(value = "/quote")
  // Quote getQuote(String symbol);

  @GetMapping(value = "/symbols")
  List<StockSymbol> getSymbols();
  
}
