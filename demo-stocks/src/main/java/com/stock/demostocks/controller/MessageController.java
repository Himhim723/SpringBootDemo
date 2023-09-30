package com.stock.demostocks.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.demostocks.model.CompanyDTO;
import com.stock.demostocks.service.CompanyService;

@RestController
@RequestMapping("/api")
public class MessageController {
  @Autowired
  CompanyService companyService;

    @GetMapping("/message")
    public String getMessage() {
        return "Hello I am Him!";
    }
    @GetMapping("/go")
    public CompanyDTO get(){
      return companyService.getResult("AAPL");
    }
}
