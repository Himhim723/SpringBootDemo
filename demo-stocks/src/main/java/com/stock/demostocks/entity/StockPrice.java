package com.stock.demostocks.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "FINNHUB_STOCK_PRICE")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StockPrice implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  // Foreign Key is not needed because it can read the data automatically
  //private Long stockId;
  @Column(name = "DATETIME",nullable = false)
  private LocalDateTime dateTime;
  @Column(name = "CURRENT_PRICE",columnDefinition = "NUMERIC(15,2)",nullable = false)
  private double currectPrice;
  @Column(name = "DAY_HIGH",columnDefinition = "NUMERIC(15,2)",nullable = false)
  private double dayHigh;
  @Column(name = "DAY_LOW",columnDefinition = "NUMERIC(15,2)",nullable = false)
  private double dayLow;
  @Column(name = "DAY_OPEN",columnDefinition = "NUMERIC(15,2)",nullable = false)
  private double dayOpen;
  @Column(name = "PREV_DAY_CLOSE",columnDefinition = "NUMERIC(15,2)",nullable = false)
  private double prevDayClose;
  @ManyToOne
  @JoinColumn(name = "stock_id",nullable = false)
  private Stock stock;
  //Hibernate see Join Column and do a lot of thing
 
}
