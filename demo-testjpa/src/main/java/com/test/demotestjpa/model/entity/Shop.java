package com.test.demotestjpa.model.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Shop")
@Getter
@Setter
public class Shop {
    @Id
    private String name;
    @ManyToOne
    private BusinessUser owner;
    @OneToMany
    private List<Food> foods;
    @OneToMany
    private List<Comment> comments;
    @OneToMany
    private List<Booking> bookings;
    @ManyToMany(mappedBy = "favoriteShops")
    private List<CustomerUser> likedByUsers;
    // getters and setters
}