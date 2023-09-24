package com.stock.demostocks.APIResponse;

import java.util.List;

import com.stock.demostocks.model.enums.Code;

import lombok.Builder;
import lombok.Getter;


@Getter
public class ApiResponse<T> {
  private int code;
  private String message;
  private T data;

  public static <T> ApiResponseBuilder<T> builder(){
    return new ApiResponseBuilder<>();
  }
  private ApiResponse (ApiResponseBuilder<T> builder){
    this.code = builder.code;
    this.message = builder.message;
    this.data = builder.data;
  }

  public static class ApiResponseBuilder<T>{
      private int code;
      private String message;
      private T data;

      public ApiResponseBuilder<T> code(Code code){
        this.code = code.getCode();
        this.message = code.getDesc();
        return this;
      }

      public ApiResponseBuilder<T> concatMessageIfPresent(String message){
        if(this.message!=null && message!=null)
        this.message.concat(" "+ message);
        return this;
      }

      public ApiResponseBuilder<T> data(T data){
        this.data = data;
        return this;
      }

      public ApiResponse<T> build(){
        return new ApiResponse<>(this);
      }
  }

}
