package com.example.demok.ResponseFramework;

import java.util.List;

import com.example.demok.enums.Code;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@ToString 
//Library suppose no annotation
public class ApiResponse<T> {

  private int code;
  private String message;
  //attribute name by default same as JSON field name after Deserialization
  private T data;
  private List<String> error;

  // {
  //  "code" : 20000 <- success meaning
  //  "message" : "Describe what is happening in your code"
  //  "data" : [<- what we can receive as data ]
  //  "error" : ["List of String with what error invoked"]
  // }

  // HTTP 404 Not Found 200-> Success

  private ApiResponse(ApiResponseBuilder<T> builder){
    this.code = builder.code;
    this.message = builder.message;
    this.data = builder.data;
  }

  public static <T> ApiResponseBuilder<T> builder(){
    return new ApiResponseBuilder<>();
  }

  public int getCode(){
    return this.code;
  }

  public String message(){
    return this.message;
  }

  public T getData(){
    return this.data;
  }

  public static class ApiResponseBuilder<T>{
    private int code;
    private String message;
    //attribute name by default same as JSON field name after Deserialization
    private T data;
    private List<String> error;

    public ApiResponseBuilder<T> status(Code code){
      this.code = code.getCode();
      this.message = code.getDesc();
      return this;
    }

    public ApiResponseBuilder<T> ok(){
      this.code = Code.SUCCESS.getCode();
      this.message = Code.SUCCESS.getDesc();
      return this;
    }

    public ApiResponseBuilder<T> data(T data){
      this.data = data;
      return this;
    }

    public ApiResponse<T> build(){
      if(code == 0 || message  == null) 
        throw new RuntimeException();
      return new ApiResponse<T>(this);
    }
  }

}