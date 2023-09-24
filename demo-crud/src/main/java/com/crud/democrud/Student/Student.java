package com.crud.democrud.Student;

import java.time.LocalDate;
import java.time.Period;

import com.crud.democrud.Student.Enums.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Student")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name= "name") private String name;
  @Column(name= "gender")private Gender gender;
  @Column(name= "age")private Integer age;
  @Column(name= "dob")private LocalDate dob;

  public Student(String name, Gender gender, LocalDate dob){
    this.name = name;
    this.gender = gender; 
    this.dob = dob;
    this.age = Period.between(dob,LocalDate.now()).getYears();
  }

  public Student(String name, Gender gender, int age, LocalDate dob){
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.dob = dob;
  }


}
