package com.example.demok.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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

public interface UserService{

  List<User> findUsers();
  List<IP> getIPs();
  List<Comment> getComments();
  List<MTRs> getMtrArrivalTime();
  List<PokemonAblum> getPokemons();
  List<Post> getPosts();
  List<Album> getAlbums();
  List<Photoss> getPhotos();
  List<ToDo> getToDos();
  List<APIPack> getPackages();
  List<Station> getArrivalTime(String line,String sta);
  


}
