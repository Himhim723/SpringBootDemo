package com.example.demok.enums;

public enum Protocal {
  HTTP("http"),
  HTTPS("https");

  public String protocal;

  private Protocal(String protocal){
    this.protocal = protocal;
  }

}
