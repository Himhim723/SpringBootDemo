package com.stock.demostocks.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.stock.demostocks.Repository.StockRepository;
import com.stock.demostocks.entity.Stock;
import com.stock.demostocks.model.Company2;
import com.stock.demostocks.model.CompanyDTO;
import com.stock.demostocks.model.Quote;
import com.stock.demostocks.model.StockSymbol;
import com.stock.demostocks.model.mapper.CompanyMapper;

@Service
public class CompanyServiceImp implements CompanyService {

  @Autowired
  private RestTemplate restTemplate;
  @Autowired
  private StockRepository stockRepository;

  @Value(value = "${api.finnhub.domain}")
  private String domain;
  @Value(value = "${api.finnhub.endpoints1.base}") 
  private String endpoint;
  @Value(value = "${api.finnhub.endpoints1.stock}") 
  private String stock;
  @Value(value = "${api.finnhub.endpoints1.quote}") 
  private String quote;

  @Override
  public CompanyDTO getResult(String symbol) {
    return CompanyMapper.convert(getCompany(symbol), getQuote(symbol));
  }
  
  @Override
  public Company2 getCompany(String symbol) {
    String url =  UriComponentsBuilder.newInstance()
                  .scheme("https")
                  .host(domain)
                  .path(endpoint)
                  .path(stock)
                  .queryParam("symbol", symbol)
                  .queryParam("token", "ck4flbhr01qus81pv4b0ck4flbhr01qus81pv4bg")
                  .build().toUriString();
    Company2 company = restTemplate.getForObject(url, Company2.class);
    return company;
  }

  @Override
  public Quote getQuote(String symbol) {
    String url2 = UriComponentsBuilder.newInstance()
                  .scheme("https")
                  .host(domain)
                  .path(endpoint)
                  .path(quote)
                  .queryParam("symbol", symbol)
                  .queryParam("token", "ck4flbhr01qus81pv4b0ck4flbhr01qus81pv4bg")
                  .build().toUriString();
    System.out.println("url = "+ url2);
    Quote quote = restTemplate.getForObject(url2, Quote.class);
    return quote;
  }

  @Override
  public List<StockSymbol> getSymbols() {
    String url = "https://finnhub.io/api/v1/stock/symbol?exchange=US&token=ck4flbhr01qus81pv4b0ck4flbhr01qus81pv4bg";
    StockSymbol[] symbols = restTemplate.getForObject(url,StockSymbol[].class);
    return Arrays.asList(symbols);
  }

  


}



  // @Value(value = "${api.finnhub.domain}")
  // private String funnhubD;
  // @Value(value = "${api.finnhub.endpoints1.base}")
  // private String endp;
  // @Value(value = "${api.finnhub.endpoints1.quote}")
  // private String endp2;
  // @Value(value = "${api.finnhub.endpoints1.param}")
  // private String param;
  // @Value(value = "${api.finnhub.endpoints1.token}")
  // private String endp3;

 
  

