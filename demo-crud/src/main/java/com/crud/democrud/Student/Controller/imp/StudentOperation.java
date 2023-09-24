package com.crud.democrud.Student.Controller.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.democrud.Student.Student;
import com.crud.democrud.Student.Controller.StudentController;
import com.crud.democrud.Student.StudentService.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentOperation implements StudentController {
  
  @Autowired
  private StudentService studentService;

  @Override
  public String MainPage(){
    return "This is a Student Page";
  }

  @Override
  public Student findStudentById(int id) {
    return studentService.findStudentById(id);
  }

  @Override
  public List<Student> findAllStudent() {
    return studentService.findAllStudent();
  }

  @Override
  public void addStudent(Student student) {
    studentService.addStudent(student);
  }

  @Override
  public void addAllStudent(Student... students) {
    studentService.addAllStudent(students);
  }

  @Override
  public void deleteStudentById(int id){
    studentService.deleteStudentById(id);
  }

  @Override
  public void adjustStudentById(int id, String name) {
    studentService.adjustStudentById(id,name);
  }


  




}
