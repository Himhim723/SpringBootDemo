package com.example.demok.config;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.support.RestGatewaySupport;

@Configuration
public class AppConfig {
  
  @Bean
  RestTemplate restTemplate(){
    RestTemplate template = new RestTemplate();
    
    //lots of states/ Variables
    // A tool/ class (library) to invoke/call third party api
    List<HttpMessageConverter<?>> collect = template.getMessageConverters().stream()
                                            .filter(m->!(m instanceof MappingJackson2XmlHttpMessageConverter))
                                            .collect(Collectors.toList());
    template.setMessageConverters(collect);
    return new RestTemplate(); 
  }



  
}
