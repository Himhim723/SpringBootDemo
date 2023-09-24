package com.stock.demostocks.service;

import java.util.List;

import com.stock.demostocks.model.Company2;
import com.stock.demostocks.model.CompanyDTO;
import com.stock.demostocks.model.Quote;
import com.stock.demostocks.model.StockSymbol;

public interface CompanyService {
  Company2 getCompany(String symbol);
  Quote getQuote(String symbol);
  CompanyDTO getResult(String symbol);
  List<StockSymbol> getSymbols();
}
