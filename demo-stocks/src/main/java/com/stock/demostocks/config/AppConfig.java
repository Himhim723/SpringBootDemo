package com.stock.demostocks.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
  
  @Bean
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }

  // @Bean
  // CommandLineRunner commandLineRunner(arg->{
  //   System.out.println("hello");
    
  // });
}
