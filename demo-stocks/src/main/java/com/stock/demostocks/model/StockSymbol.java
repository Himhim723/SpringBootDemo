package com.stock.demostocks.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StockSymbol {
  public String currency;
  public String description;
  public String displaySymbol;
  public String figi;
  public Object isin;
  public String mic;
  public String shareClassFIGI;
  public String symbol;
  public String symbol2;
  public String type;
}

