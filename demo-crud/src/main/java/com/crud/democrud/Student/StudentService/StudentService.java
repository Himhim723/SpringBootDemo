package com.crud.democrud.Student.StudentService;

import java.util.List;


import com.crud.democrud.Student.Student;

public interface StudentService {

  Student findStudentById(int id);
  List<Student> findAllStudent();
  void addStudent(Student student);
  void addAllStudent(Student... students);
  void deleteStudentById(int id);
  void adjustStudentById(int id, String name);

  
}
