package com.test.demotestjpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.demotestjpa.entity.BusinessUser;
import com.test.demotestjpa.entity.Comment;
import com.test.demotestjpa.entity.Food;
import com.test.demotestjpa.entity.Shop;

public interface BMController {
    @PostMapping(value = "/signUp")
    BusinessUser signUp(@RequestBody BusinessUser member);

    @DeleteMapping(value = "/home/{username}")
    void deleteAccount(@PathVariable String username);

    @PatchMapping(value = "/home/{username}")
    void adjustPassword(@PathVariable String username, @RequestParam String password);

    @PostMapping(value = "/home/{username}/shop")
    Shop addShop(@PathVariable String username, @RequestBody Shop shop);

    @GetMapping(value = "/home/{username}/shops")
    List<Shop> findMyShops(@PathVariable String username);

    @GetMapping(value = "/home/{username}/shop/{shopName}")
    Shop findMyShopByName(@PathVariable String username, @PathVariable String shopName);

    @PostMapping(value = "/home/user/{username}/shop/{shopName}")
    List<Food> addFoodToShop(@PathVariable String username, @PathVariable String shopName, @RequestBody List<Food> foods);

    @DeleteMapping(value = "/home")
    void deleteFoodFromShop(@RequestParam String username, @RequestParam String shopName, @RequestParam int foodId);

    @PatchMapping(value = "/home")
    Food adjustPrice(@RequestParam String username, @RequestParam String shopName, @RequestParam int foodId, @RequestParam double price);

    @GetMapping(value = "/home/user/{username}/shop/{shop}/comment")
    List<Comment> findAllComments(@PathVariable String username, @PathVariable String shopName);
}
