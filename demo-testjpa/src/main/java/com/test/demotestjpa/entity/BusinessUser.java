package com.test.demotestjpa.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class BusinessUser extends User {
    @OneToMany(mappedBy = "owner")
    private List<Shop> shops;

    // getters, setters
}