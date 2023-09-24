package com.stock.demostocks.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "FINNHUB_STOCKS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Stock implements Serializable{
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "COUNTRY",nullable = false)
  private String country;
  @Column(name = "COMPANY_NAME",nullable = false)
  private String companyName;
  @Column(name = "IPO_DATE",nullable = false)
  private LocalDate ipoDate;
  @Column(name = "LOGO",nullable = false)
  private String logo;
  @Column(name = "MARKET_CAP",columnDefinition = "NUMERIC(15,2)",nullable = false)
  private double marketCap;
  @Column(name = "CURRENCY",nullable = false)
  private String currency;


  
}
