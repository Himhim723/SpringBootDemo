package com.example.demok.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserDTO {
  private long id;
  private String name;
  private String username;

  private UserDTO(UserDTOBuilder builder){
    this.id = builder.id;
    this.name = builder.name;
    this.username = builder.username;
  }
  
  public static UserDTOBuilder builder(){
    return new UserDTOBuilder();
  }

  public static class UserDTOBuilder{
    long id;
    String name;
    String username;

    public UserDTOBuilder id(long id){
      this.id = id;
      return this;
    }

    public UserDTOBuilder name (String name){
      this.name = name;
      return this;
    }

    public UserDTOBuilder username(String username){
      this.username = username;
      return this;
    }

    public UserDTO build(){
      return new UserDTO(this);
    }
  }
  
}
