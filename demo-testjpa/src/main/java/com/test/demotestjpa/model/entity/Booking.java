package com.test.demotestjpa.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Booking")
@Getter
@Setter
public class Booking {
    @Id
    private Integer bookingId;
    @ManyToOne
    private Shop shop;
    private LocalDateTime bookingTime;
    @ManyToOne
    private CustomerUser customer;
    private Integer numOfCustomers;
    private LocalDateTime registeredTime;
    // getters and setters
}
