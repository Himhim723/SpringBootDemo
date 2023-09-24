package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Post;
import com.example.demo.Model.User;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserWithPost;

@RestController
@RequestMapping(value = "/v1")
public class AppController {

  @Autowired
  private AppService service;

  @GetMapping(value = "/getFromObject")
  public UserDto getUsers(){
    return service.getUsers();
  }

  @GetMapping(value = "/posts")
  public List<Post> getPosts(){
    return service.getPost();
  }

  @PostMapping(value = "/getUserWithPost")
  public UserWithPost getUserWithPost(){
    return service.getUserWithPost();
  }


}
