package com.example.demo.dto.Mapper;

import java.util.List;

import com.example.demo.Model.Post;
import com.example.demo.Model.User;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserWithPost;

public class ObjectMapper {
  
  public static UserDto userToUserDto(User user){
    return UserDto.builder().id(user.getId())
                    .name(user.getName())
                    .username(user.getUsername())
                    .email(user.getEmail())
                    .phone(user.getPhone())
                    .build();
  }

  public static UserWithPost userDtoToUserWithPost(UserDto user,List<Post> posts){
    return UserWithPost.builder().id(user.getId())
                    .name(user.getName())
                    .username(user.getUsername())
                    .email(user.getEmail())
                    .phone(user.getPhone())
                    .posts(posts)
                    .build();
    // {
    //   "id": 1,
    //   "name": "Leanne Graham",
    //   "username": "Bret",
    //   "email": "Sincere@april.biz",
    //   "phone": "1-770-736-8031 x56442",
    //   "post": [
    //       {
    //           "userId": 1,
    //           "id": 1,
    //           "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
    //           "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
    //       },
    //       {
    //           "userId": 1,
    //           "id": 2,
    //           "title": "qui est esse",
    //           "body": "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"
    //       }
    //     ]
    // }
  }
}
