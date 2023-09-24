package com.test.demotestjpa.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Food")
@Getter
@Setter
public class Food {
    @Id
    private Integer foodId;
    private String foodName;
    private Double foodPrice;
    // getters and setters
}
