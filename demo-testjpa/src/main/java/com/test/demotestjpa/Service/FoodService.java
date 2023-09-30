package com.test.demotestjpa.Service;

import java.util.List;

import com.test.demotestjpa.entity.Food;

// FoodService.java
public interface FoodService {
    List<Food> addFoodToShop(String username, String shopName, List<Food> foods);
    void deleteFoodFromShop(String username, String shopName, int foodId);
    Food adjustPrice(String username, String shopName, int foodId, double price);
}
