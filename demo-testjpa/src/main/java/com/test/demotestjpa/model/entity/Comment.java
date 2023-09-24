package com.test.demotestjpa.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Comment")
@Getter
@Setter
public class Comment {
    @Id
    private int id;
    private LocalDateTime postTime;
    @ManyToOne
    private CustomerUser postedBy;
    private String description;
    // getters and setters
}