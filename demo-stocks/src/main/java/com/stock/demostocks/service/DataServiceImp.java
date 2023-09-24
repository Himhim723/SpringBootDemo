package com.stock.demostocks.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.stock.demostocks.Repository.StockPriceRepository;
import com.stock.demostocks.Repository.StockRepository;
import com.stock.demostocks.entity.Stock;
import com.stock.demostocks.entity.StockPrice;
import com.stock.demostocks.model.Company2;
import com.stock.demostocks.model.Quote;
import com.stock.demostocks.model.mapper.CompanyMapper;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class DataServiceImp implements DataService{

  @Autowired
  RestTemplate restTemplate;

  @Autowired
  private StockRepository stockRepository;
  @Autowired 
  private StockPriceRepository stockPriceRepository;
  @Autowired
  private CompanyService companyService;

  @Override
  public List<Stock> findAll() {
    return stockRepository.findAll();
  }

  @Override
  public Stock save(Stock stock) {
    return stockRepository.save(stock);
  }

  @Override
  public void deleteById(Long id) {
    stockRepository.deleteById(id);;
  }

  @Override 
  public void deleteAll(){
    stockRepository.deleteAll();
  }

  @Override
  public Stock update(Long id,Stock stock) {
    Stock stk = stockRepository.findById(id).orElseThrow(()-> new EntityNotFoundException());
    stk.setCompanyName(stock.getCompanyName());
    stk.setCountry(stock.getCountry());
    stk.setCurrency(stock.getCurrency());
    stk.setIpoDate(stock.getIpoDate());
    stk.setLogo(stock.getLogo());
    stk.setMarketCap(stock.getMarketCap());
    return stk;
  }

  @Override
  //@Transactional
  public Stock updateCompanyName(Long id, String name) {
    Stock stk = stockRepository.findById(id).orElseThrow(()-> new EntityNotFoundException());
    stk.setCompanyName(name);
    stockRepository.save(stk);
    return stk;
  }

  @Override
  public Stock saveFromObject(String symbol) {
    String url = "https://finnhub.io/api/v1/stock/profile2?symbol="+symbol+"&token=ck4flbhr01qus81pv4b0ck4flbhr01qus81pv4bg";
    Company2 c = restTemplate.getForObject(url, Company2.class);
    Stock stock = CompanyMapper.companyToStock(c);
    return stockRepository.save(stock);
  }

  @Override
  public StockPrice saveStockPrice (String symbol,Stock stock){
    String url = "https://finnhub.io/api/v1/quote?symbol="+symbol+"&token=ck4flbhr01qus81pv4b0ck4flbhr01qus81pv4bg";
    Quote c = restTemplate.getForObject(url, Quote.class);
    StockPrice stocks = StockPrice.builder().currectPrice(c.getC())
                                           .dayHigh(c.getH())
                                           .dayLow(c.getL())
                                           .dayOpen(c.getO())
                                           .prevDayClose(c.getPc())
                                           .dateTime(LocalDateTime.now())
                                           .stock(stock)
                                           .build();
    return stockPriceRepository.save(stocks);
  }

  

  
}
