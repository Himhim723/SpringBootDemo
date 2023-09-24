package com.example.demo.Controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.UserWithPost;

public interface UserRepository extends JpaRepository<UserWithPost,Long>{
  
}
