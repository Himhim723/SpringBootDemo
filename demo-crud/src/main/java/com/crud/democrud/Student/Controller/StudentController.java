package com.crud.democrud.Student.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.democrud.Student.Student;

public interface StudentController {
  
  @GetMapping
  String MainPage();

  //http://localhost:8080/student/find?id=1
  // @GetMapping(value = "find")
  // Student findStudentById(@RequestParam int id);

  //http://localhost:8080/student/find/watch2
  @GetMapping(value = "/find/watch{id}")
  Student findStudentById(@PathVariable int id);

  @GetMapping(value = "/stulist")
  List<Student> findAllStudent();

  @PostMapping(value = "/add")
  void addStudent(@RequestBody Student student);

  @PostMapping (value = "/addAll")
  void addAllStudent(@RequestBody Student... students);

  @DeleteMapping (value = "/delete")
  void deleteStudentById(@RequestParam int id);

  @PutMapping(value = "/adjust")
  void adjustStudentById(@RequestBody int id, @RequestBody String name);

  //RequestBody 
  //RequestParam & PathVariable 
}
