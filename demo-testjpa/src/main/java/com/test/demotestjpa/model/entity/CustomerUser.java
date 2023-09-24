package com.test.demotestjpa.model.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Customer")
@Getter
@Setter
public class CustomerUser extends User {
    private String name;
    private String phone;
    private String email;
    private String creditCardNumber;
    @ManyToMany
    private List<Shop> favoriteShops;
    @OneToMany
    private List<Booking> bookings;
    // getters and setters
}
