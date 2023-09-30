package com.test.demotestjpa.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private BusinessUser owner;
    private String name;
    @OneToMany(mappedBy = "shop")
    private List<Food> foods;
    @OneToMany(mappedBy = "shop")
    private List<Comment> comments;
    @OneToMany(mappedBy = "shop")
    private List<Booking> bookings;
    @ManyToMany(mappedBy = "myFavoriteShops")
    private List<CustomerUser> customersLiked;

    // getters, setters
}