package com.example.demok.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demok.ResponseFramework.ApiResponse;
import com.example.demok.enums.Code;
import com.example.demok.mapper.UserMapper;
import com.example.demok.model.Album;
import com.example.demok.model.Comment;
import com.example.demok.model.IP;
import com.example.demok.model.MTRs;
import com.example.demok.model.Photoss;
import com.example.demok.model.PokemonAblum;
import com.example.demok.model.Post;
import com.example.demok.model.Station;
import com.example.demok.model.ToDo;
import com.example.demok.model.User;
import com.example.demok.model.UserDTO;
import com.example.demok.model.FreeGovAPI.APIPack;
import com.example.demok.service.UserService;


@RestController
@RequestMapping(value = "/api/v1")
public class UserOperation implements UserController{

  @Autowired
  private UserService userService;

  @Override
  public ResponseEntity<ApiResponse<List<UserDTO>>> findAll() {
    List<User> users = userService.findUsers();
    if (users == null) {
      ApiResponse<List<UserDTO>> response = ApiResponse.<List<UserDTO>>builder() //
        .status(Code.JPH_NOTFOUND) //
        .build();
      return ResponseEntity.badRequest().body(response);
    }else{
    List<UserDTO> user = users.stream().map(e-> UserMapper.map(e))
                                       .collect(Collectors.toList());
    ApiResponse<List<UserDTO>> response = ApiResponse.<List<UserDTO>>builder() //
        .ok() //
        .data(user) //
        .build();
    return ResponseEntity.ok().body(response);
    }
  }



  @Override
  public List<IP> getIPs() {
    return this.userService.getIPs();
  }

  @Override
  public List<Comment> getComments() {
    return this.userService.getComments();
  }

  @Override
  public List<MTRs> getMtrArrivalTime() {
    return this.userService.getMtrArrivalTime();
  }

  @Override
  public List<PokemonAblum> getPokemons() {
    return this.userService.getPokemons();
  }

  @Override
  public List<Post> getPosts() {
    return this.userService.getPosts();
  }

  @Override
  public List<Album> getAlbums() {
    return this.userService.getAlbums();
  }

  @Override
  public List<Photoss> getPhotos() {
    return this.userService.getPhotos();
  }

  @Override
  public List<ToDo> getToDos() {
    return this.userService.getToDos();
  }

  @Override
  public List<APIPack> getPackages() {
    return this.userService.getPackages();
  }
  
  @Override
  public List<Station> getArrivalTime(String line, String sta){
    return this.userService.getArrivalTime(line,sta);
  }
}
