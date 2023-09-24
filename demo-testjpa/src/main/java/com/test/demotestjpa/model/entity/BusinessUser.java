package com.test.demotestjpa.model.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Business")
@Getter
@Setter
public class BusinessUser extends User {
    @OneToMany
    private List<Shop> shops;
    // getters and setters
}