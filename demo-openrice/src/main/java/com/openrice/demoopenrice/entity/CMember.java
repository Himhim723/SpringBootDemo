// package com.openrice.demoopenrice.entity;

// import java.io.Serializable;
// import java.util.List;

// import com.openrice.demoopenrice.model.Booking;

// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Entity
// @Table(name = "Customer")
// @AllArgsConstructor
// @NoArgsConstructor
// @Getter
// @Setter
// @Builder
// public class CMember implements Serializable{
//   @Id
//   private String username;
//   private String password;
//   private String name;
//   private String phone;
//   private String email;
//   private String creditCard;
//   // @OneToMany(mappedBy = "liked",cascade = CascadeType.ALL)
//   // private List<Shop> myFavShops;
//   @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
//   private List<Booking> myBookings;


// }
