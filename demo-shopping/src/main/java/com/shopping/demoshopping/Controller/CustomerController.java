package com.shopping.demoshopping.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.demoshopping.Service.CustomerService;


@RestController
@RequestMapping(value = "/api/v1")
public class CustomerController implements CustomerControllerImp{

  @Autowired
  private CustomerService customerService;




}
