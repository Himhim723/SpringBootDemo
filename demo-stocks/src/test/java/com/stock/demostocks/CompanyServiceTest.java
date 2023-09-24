package com.stock.demostocks;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.stock.demostocks.Repository.StockRepository;
import com.stock.demostocks.entity.Stock;
import com.stock.demostocks.service.DataService;

@SpringBootTest
public class CompanyServiceTest {

  @MockBean
  StockRepository stockRepository;
  @Autowired
  DataService stockService;

  @Test
  void testFindAll(){
    Stock a = Stock.builder().id(1l).companyName("A").build();
    Stock b = Stock.builder().id(1l).companyName("A").build();
    Mockito.when(stockRepository.findAll()).thenReturn(List.of(a,b));
    
  }

}
