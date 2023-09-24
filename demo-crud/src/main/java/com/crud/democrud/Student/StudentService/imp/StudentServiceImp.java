package com.crud.democrud.Student.StudentService.imp;

import java.util.IllegalFormatFlagsException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud.democrud.Student.Student;
import com.crud.democrud.Student.Controller.StudentController;
import com.crud.democrud.Student.Repository.StudentRepository;
import com.crud.democrud.Student.StudentService.StudentService;

@Service
public class StudentServiceImp implements StudentService{
  
  @Autowired
  private StudentRepository studentRepository;

  @Override
  public Student findStudentById(int id) {
    return studentRepository.findById(id).get();
  }

  @Override
  public List<Student> findAllStudent() {
    return studentRepository.findAll();
  }

  @Override
  public void addStudent(Student student) {
    studentRepository.save(student);
  }

  @Override
  public void addAllStudent(Student... students) {
    studentRepository.saveAll(List.of(students));
  }

  @Override
  public void deleteStudentById(int id){
    studentRepository.deleteById(id);
  }

  @Override
  @Transactional
  public void adjustStudentById(int id, String name){
    studentRepository.findById(id).get().setName(name);
  }


}
