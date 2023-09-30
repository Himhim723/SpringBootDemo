package com.test.demotestjpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demotestjpa.entity.Food;


@Repository
public interface FoodRepository extends JpaRepository<Food, String> {
}
