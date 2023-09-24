package com.stock.demostocks.exception;

import com.stock.demostocks.model.enums.Code;

public class FinnhubException extends BusinessException {
  
  public FinnhubException(Code code){
    super(code);
  } 
}
