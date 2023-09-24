package com.openrice.demoopenrice.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Shop")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Shop implements Serializable{
  @Id
  private String name;
  private String food;
  private List<String> menu;
  // private List<Food> menu;
  // private List<Comment> comments;
  // private List<Booking> bookings;
  // @ManyToMany
  // @JoinColumn(name = "LikedBy",nullable = true)
  // private List<CMember> liked = new ArrayList<>();

}