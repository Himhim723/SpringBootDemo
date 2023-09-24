package com.example.demok.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
public enum Code {
  //2xxxx means success
  SUCCESS(20000,"OK"),
  //4xxxx means error
  NOTFOUND(40000,"Not Found"), //"Resource Not Found"  // Server Time Out
  // Server Error/ 
  SERVER_TIMEOUT(50000,"Server Timeout"),
  JPH_NOTFOUND(40001,"JasonPlaceHolder Not Found");

  private int code;
  private String desc;

  private Code(int code, String desc){
    this.code = code;
    this.desc = desc;
  }


}
