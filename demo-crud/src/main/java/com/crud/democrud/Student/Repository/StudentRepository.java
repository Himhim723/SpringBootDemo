package com.crud.democrud.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.democrud.Student.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
  
}
