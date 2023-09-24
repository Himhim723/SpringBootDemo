package com.example.demok.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demok.ResponseFramework.ApiResponse;
import com.example.demok.enums.Code;
import com.example.demok.model.UserDTO;

//@RestControllerAdvice //@ControllerAdvice + @ResponseBody
public class GlobalExceptionHandler {
  
  //When there is any BusinessException Error, This method can receive notice immediately
  //and then we can run the following method before returning to controller
  @ExceptionHandler(value = BusinessException.class) // value 放 Exception Class
  public ResponseEntity<ApiResponse<Void>> getUserExceptionHandler(){
    ApiResponse<Void> response = ApiResponse.<Void>builder() //
        .status(Code.JPH_NOTFOUND) //
        .data(null) //
        .build();
    return ResponseEntity.badRequest().body(response);
  }
}
