package com.shopping.demoshopping.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
  
  @Bean
  RestTemplate restTemplate(){ // public private 
    return new RestTemplate();
  }
}
