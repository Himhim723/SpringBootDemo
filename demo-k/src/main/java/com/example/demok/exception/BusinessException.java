package com.example.demok.exception;

import com.example.demok.enums.Code;

public class BusinessException extends Exception{

  private int code;

  public BusinessException(Code code){
    super(code.getDesc());
    this.code = code.getCode();
  }
  
}
