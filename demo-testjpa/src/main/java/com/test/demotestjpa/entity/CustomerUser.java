package com.test.demotestjpa.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CustomerUser extends User {
    private String name;
    private String phone;
    private String email;
    private String creditCardNumber;
    @ManyToMany
    private List<Shop> myFavoriteShops;
    @OneToMany(mappedBy = "customerUser")
    private List<Booking> bookings;

    // getters, setters
}