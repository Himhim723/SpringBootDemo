package com.stock.demostocks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.stock.demostocks.APIResponse.ApiResponse;
import com.stock.demostocks.model.Company2;
import com.stock.demostocks.model.CompanyDTO;
import com.stock.demostocks.model.CompanyDTO.Company;
import com.stock.demostocks.model.enums.Code;
import com.stock.demostocks.model.Quote;
import com.stock.demostocks.model.StockSymbol;
import com.stock.demostocks.service.CompanyService;

@RestController
public class UserOperation implements UserController{
  @Autowired
  private CompanyService companyService;

  @Override
  public ApiResponse<CompanyDTO> getResult(String symbol){
    if (symbol.isBlank())
      throw new IllegalArgumentException("Parameter Symbol is blank");
      CompanyDTO c = companyService.getResult(symbol);
    return ApiResponse.<CompanyDTO>builder().code(Code.OK).data(c).build();
  }
  // @Override
  // public Company2 getCompany(String symbol) {
  //   return companyService.getCompany(symbol);
  // }
  // @Override
  // public Quote getQuote(String symbol) {
  //   return companyService.getQuote(symbol);
  // } 

  @Override
  public List<StockSymbol> getSymbols() {
    return companyService.getSymbols();
  }
}
