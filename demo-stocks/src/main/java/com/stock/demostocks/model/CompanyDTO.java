package com.stock.demostocks.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CompanyDTO {
  private Company company;
  private double currentPrice;
  private double dayHigh;
  private double dayLow;
  private double dayOpen;
  private double prevDayClose;


  @Builder
  @Getter
  @Setter
  public static class Company{
    private String country;
    private String companyName;
    private LocalDate ipoDate;
    private String logo;
    private double marketCap;
    private String currency;

  }
}
