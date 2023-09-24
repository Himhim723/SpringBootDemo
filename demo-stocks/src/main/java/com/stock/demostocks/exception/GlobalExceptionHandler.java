package com.stock.demostocks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.stock.demostocks.APIResponse.ApiResponse;
import com.stock.demostocks.model.enums.Code;

import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
  
  private static Code getRespCode(Exception e) {
    if (e instanceof IllegalArgumentException) {
      return Code.IAE_EXCEPTION;
    } else if (e instanceof EntityNotFoundException){
      return Code.RESOURCES_NOTFOUND;
    }
    return null;
  }
  
  @ExceptionHandler(value = FinnhubException.class)
  @ResponseStatus(value = HttpStatus.OK)
  public ApiResponse<Void> finnhubExceptionHandler(FinnhubException e) {
    return ApiResponse.<Void>builder() //
        .code(Code.fromCode(e.getCode())) //
        .data(null) //
        .build();
  }

  @ExceptionHandler(value = RuntimeException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public ApiResponse<Void> iAEExceptionHandler(RuntimeException e) {
    return ApiResponse.<Void>builder() //
        .code(getRespCode(e)) //
        .concatMessageIfPresent(e.getMessage())
        .data(null) //
        .build();
  }

  
}
