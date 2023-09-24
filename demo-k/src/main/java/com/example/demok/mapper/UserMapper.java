package com.example.demok.mapper;

import com.example.demok.model.User;
import com.example.demok.model.UserDTO;

public class UserMapper {
  
  public static UserDTO map(User e){
    return UserDTO.builder().name(e.getName())
                            .username(e.getUsername())
                            .id(e.getId())
                            .build();
  }
}
