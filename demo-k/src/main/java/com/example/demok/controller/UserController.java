package com.example.demok.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demok.ResponseFramework.ApiResponse;
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

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



public interface UserController {
  @GetMapping(value = "/users")
  ResponseEntity<ApiResponse<List<UserDTO>>> findAll();
  // @GetMapping(value = "/hello")
  // String hello();
  @GetMapping(value = "/comments")
  List<Comment> getComments();
  @GetMapping(value = "/posts")
  List<Post> getPosts();
  @GetMapping(value = "/albums")
  List<Album> getAlbums();
  @GetMapping(value = "/photos")
  List<Photoss> getPhotos();
  @GetMapping(value = "/todos")
  List<ToDo> getToDos();

  //Not success
  @GetMapping(value = "/pokemon")
  List<PokemonAblum> getPokemons();
  @GetMapping(value = "/ips")
  List<IP> getIPs();
  @GetMapping(value = "/arrivaltime")
  List<MTRs> getMtrArrivalTime();
  @GetMapping(value = "/packages")
  List<APIPack> getPackages();
  @GetMapping(value = "/arrive")
  List<Station> getArrivalTime(@RequestParam String line,@RequestParam String sta);
}
