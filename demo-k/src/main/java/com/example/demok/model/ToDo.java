package com.example.demok.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ToDo {
  private int userId;
  private int id;
  private String title;
  private boolean completed;
}
