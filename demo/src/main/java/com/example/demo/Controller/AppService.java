package com.example.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Model.Post;
import com.example.demo.Model.User;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserWithPost;
import com.example.demo.dto.Mapper.ObjectMapper;

@Service
public class AppService {

  @Autowired
  private RestTemplate restTemplate;
  @Autowired
  private UserRepository userRepository;

  public UserDto getUsers(){
    String url = "https://jsonplaceholder.typicode.com/users";
    User[] users = restTemplate.getForObject(url, User[].class);
    return ObjectMapper.userToUserDto(users[1]);
  }

  public List<Post> getPost(){
    String url = "https://jsonplaceholder.typicode.com/posts";
    Post[] posts = restTemplate.getForObject(url, Post[].class);
    return Arrays.asList(posts);
  }

  public UserWithPost getUserWithPost(){
    UserWithPost user =  ObjectMapper.userDtoToUserWithPost(getUsers(), getPost());
    return userRepository.save(user);
  }





}
