// package com.openrice.demoopenrice.model;

// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;

// import com.openrice.demoopenrice.entity.CMember;
// import com.openrice.demoopenrice.entity.Shop;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Entity
// @Table(name = "Bookings")
// @Builder
// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
// public class Booking {
//   @ManyToOne
//   @JoinColumn(name = "Shop")
//   private Shop shop;
//   @ManyToOne
//   @JoinColumn(name = "Customer")
//   private CMember customer;
//   @Id
//   private int id;
//   private LocalDateTime registerTime;
//   private String shopName;
//   private LocalDate bookingDate;
//   private LocalTime bookingTime;
//   private String userName;
//   private int numOfCustomer;


// }
