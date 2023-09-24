package com.example.demo.dto;

import com.example.demo.Model.Company;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
  private long id;
  private String name;
  private String username;
  private String email;
  private String phone;
}
