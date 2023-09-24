package com.stock.demostocks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.demostocks.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice,Long>{
  
   
}
