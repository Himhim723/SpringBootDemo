package com.example.demok.model.FreeGovAPI;

import java.util.List;

import lombok.Getter;

@Getter
public class APIPack {
  private String help;
  private boolean success;
  private List<String> result;
}
