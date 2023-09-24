package com.example.demok.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demok.enums.Code;
import com.example.demok.enums.Protocal;
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
import com.example.demok.model.FreeGovAPI.APIPack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

  @Autowired // From Configuration
  private RestTemplate restTemplate;

  @Value(value = "${apii.jsong.domain}") // @Value search from yml/properties
  private String jphDomain; //
  @Value(value = "${apii.jsong.endpoints.user}") // must match the path in yml
  private String userEndpoint; // user

  @Override
  public List<User> findUsers() {
    String url = UriComponentsBuilder.newInstance()
        .scheme("https")
        .host(jphDomain)
        .path(userEndpoint)
        .toUriString();
    System.out.println("url = " + url);

    // Invoke API + use Jackson DeSerialization (from json to Object)
    // Use Java Reflection API to create Object
    User[] users = restTemplate.getForObject(url, User[].class);
    return Arrays.asList(users);
  }

  @Value(value = "${apii.jsong.endpoints.comments}")
  private String commentsEndPoint;

  @Override
  public List<Comment> getComments(){
    String url = UriComponentsBuilder.newInstance().scheme("https").host(jphDomain).path(commentsEndPoint).toUriString();
    Comment[] comments = restTemplate.getForObject(url, Comment[].class);
    return Arrays.asList(comments);
  }

 @Override
  public List<MTRs> getMtrArrivalTime(){
    String url = "https://rt.data.gov.hk/v1/transport/mtr/getSchedule.php";
      MTRs arrivalTime = restTemplate.getForObject(url, MTRs.class);
      return Arrays.asList(arrivalTime);
  }

  
  //{
    //"resultCode":0,
    //"timestamp":"2023-09-17 16:34:26",
    //"status":0,
    //"message":"Please type the line-station",
    //"error":{
      //"errorCode":"NT-301",
      //"errorMsg":"Please type the line-station"
    //}
  //}

  @Value(value = "${apii.jsong.domain2}") // @Value search from yml/properties
  private String jphDomain2; //
  @Value(value = "${apii.jsong.endpoints2.e2}") // must match the path in yml
  private String userEndpoint2; // user

  public List<IP> getIPs() {
    String url = "https://ipapi.co/json";
    // UriComponentsBuilder.newInstance()
    // .scheme("https")
    // .host(jphDomain2)
    // .path(userEndpoint2)
    // .toUriString();
    System.out.println("url =  "+ url);
    IP ips = restTemplate.getForObject(url, IP.class);
    return Arrays.asList(ips);
  }

    public List<PokemonAblum> getPokemons() {
    String url = "https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0";
    System.out.println("url =  "+ url);
    PokemonAblum ips = restTemplate.getForObject(url, PokemonAblum.class);
    return Arrays.asList(ips);
  }


    @Override
    public List<Post> getPosts() {
      String url = "https://jsonplaceholder.typicode.com/posts";
      Post[] posts = restTemplate.getForObject(url,Post[].class);
      return Arrays.asList(posts);
    }


    @Override
    public List<Album> getAlbums() {
      String url = "https://jsonplaceholder.typicode.com/albums";
      Album[] albums = restTemplate.getForObject(url,Album[].class);
      return Arrays.asList(albums);
    }



    @Override
    public List<Photoss> getPhotos() {
      String url ="https://jsonplaceholder.typicode.com/photos";
      Photoss[] photos = restTemplate.getForObject(url,Photoss[].class);
      return Arrays.asList(photos);
    }


    @Override
    public List<ToDo> getToDos() {
      String url = "https://jsonplaceholder.typicode.com/todos";
      ToDo[] toDos = restTemplate.getForObject(url,ToDo[].class);
      return Arrays.asList(toDos);
    }


    @Override
    public List<APIPack> getPackages() {
      String url = "https://demo.ckan.org/api/3/action/package_list";
      APIPack apis = restTemplate.getForObject(url, APIPack.class);
      return Arrays.asList(apis);
    }

    @Override
    public List<Station> getArrivalTime(String line, String sta) {
      String url = "https://rt.data.gov.hk/v1/transport/mtr/getSchedule.php?line="+line+"&sta="+sta;
      Station arrivalTime = restTemplate.getForObject(url, Station.class);
      return Arrays.asList(arrivalTime);
    }

// Cannot deserialize value of type `[Lcom.example.demok.model.IP;` from Object value (token `JsonToken.START_OBJECT`)
  // public List<User> findVideosFromYoutube(){
  // String url = UriComponentsBuilder.newInstance()
  // .scheme("https")
  // .host("youtube.com")
  // .path("/watch?v=81Fe2Hr77DDa")
  // .path(commentsEndpoint)
  // .toUriString();
  // System.out.println("url = "+url);
  // User[] users = restTemplate.getForObject(url, User[].class);
  // return Arrays.asList(users);
  // }

}
