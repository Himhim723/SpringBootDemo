package com.openrice.demoopenrice.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.openrice.demoopenrice.model.Booking;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
//@Table(name = "Customer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class CMember extends Member{
  private String name;
  private String phone;
  private String email;
  private String creditCard;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(
    name = "Liked_Shop",
    joinColumns = @JoinColumn(name = "name"),
    inverseJoinColumns = @JoinColumn(name = "liked"))
  @JsonIgnoreProperties(value = {"comments","bookings","liked"})
  private List<Shop> myFavShops;

  @OneToMany
  //@JoinTable(name = "bookingOfShops")
  @JsonIgnoreProperties(value = "liked")
  private List<Booking> myBookings;


}
