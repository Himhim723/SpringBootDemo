// package com.openrice.demoopenrice.model;

// import java.time.LocalDateTime;

// import com.openrice.demoopenrice.entity.Shop;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.Table;
// import lombok.Builder;
// import lombok.Getter;
// import lombok.Setter;
// @Entity
// @Table(name = "Comment")
// @Builder
// @Getter
// @Setter
// public class Comment {
//   @ManyToOne
//   @JoinColumn(name = "shop_Name")
//   private Shop shop;
//   @Id
//   private int id;
//   private LocalDateTime time;
//   private String username;
//   private String comment;

// }
