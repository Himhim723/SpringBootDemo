package com.example.demo.dto;

import java.util.List;

import com.example.demo.Model.Post;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserWithPost {
  @Id
  private long id;
  private String name;
  private String username;
  private String email;
  private String phone;
  @OneToMany(cascade = CascadeType.ALL)
  private List<Post> posts;
}
