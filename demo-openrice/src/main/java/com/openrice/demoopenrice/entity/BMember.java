package com.openrice.demoopenrice.entity;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "BusinessMember")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BMember extends Member{
  @OneToMany(cascade = CascadeType.ALL)
  private List<Shop> myShops;


  

}
