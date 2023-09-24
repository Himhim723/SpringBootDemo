package com.stock.demostocks.model.mapper;

import com.stock.demostocks.entity.Stock;
import com.stock.demostocks.model.Company2;
import com.stock.demostocks.model.CompanyDTO;
import com.stock.demostocks.model.Quote;
import com.stock.demostocks.model.CompanyDTO.Company;

public class CompanyMapper {

  //ModelMapper.map(Object, object class)

  public static CompanyDTO convert(Company2 c,Quote q){
    return CompanyDTO.builder()
            .company(Company.builder()
                     .country(c.getCountry())
                     .companyName(c.getName())
                     .ipoDate(c.getIpo())
                     .logo(c.getLogo())
                     .marketCap(c.getMarketCapitalization())
                     .currency(c.getCurrency())
                     .build())
            .currentPrice(q.getC())
            .dayHigh(q.getH())
            .dayLow(q.getL())
            .dayOpen(q.getO())
            .prevDayClose(q.getPc())
            .build();
  }

  public static Stock companyToStock(Company2 c){
    return Stock.builder().country(c.getCountry())
    .companyName(c.getName())
    .ipoDate(c.getIpo())
    .marketCap(c.getMarketCapitalization())
    .logo(c.getLogo())
    .currency(c.getCurrency())
    .build();
  }
}
