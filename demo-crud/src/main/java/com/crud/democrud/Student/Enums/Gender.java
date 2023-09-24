package com.crud.democrud.Student.Enums;

public enum Gender {
  MALE("Male"),
  FEMALE("Female");

  String gender;
  private Gender(String gender){
    this.gender = gender;
  }
}
