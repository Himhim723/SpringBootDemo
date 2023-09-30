package com.test.demotestjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demotestjpa.Repository.BusinessUserRepository;
import com.test.demotestjpa.Repository.ShopRepository;
import com.test.demotestjpa.entity.BusinessUser;
import com.test.demotestjpa.entity.Comment;
import com.test.demotestjpa.entity.Food;
import com.test.demotestjpa.entity.Shop;
import com.test.demotestjpa.entity.UserType;

@RestController
@RequestMapping(value = "/v1")
public class BMControllerImpl implements BMController {
  @Autowired  
  private BusinessUserRepository businessUserRepository;
  @Autowired
  private ShopRepository shopRepository;

    @Override
    @PostMapping(value = "/signUp")
    public BusinessUser signUp(@RequestBody BusinessUser businessUser) {
        String username = businessUser.getUsername();
        // Check if the username already exists
        if (businessUserRepository.existsById(username)) {
            throw new RuntimeException("Username already exists");
        }

        businessUser.setType(UserType.BUSINESS);
        businessUserRepository.save(businessUser);
        return businessUser;
    }

    @Override
    @PostMapping(value = "/home/{username}/shop")
    public Shop addShop(@PathVariable String username, @RequestBody Shop shop) {
        BusinessUser businessUser = businessUserRepository.findById(username)
                .orElseThrow(() -> new RuntimeException("Business user not found"));

        shop.setOwner(businessUser);
        shopRepository.save(shop);
        return shop;
    }

    @Override
    @GetMapping(value = "/home/{username}/shops")
    public List<Shop> findMyShops(@PathVariable String username) {
        BusinessUser businessUser = businessUserRepository.findById(username)
                .orElseThrow(() -> new RuntimeException("Business user not found"));

        return businessUser.getShops();
    }

    @Override
    public void deleteAccount(String username) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

    @Override
    public void adjustPassword(String username, String password) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'adjustPassword'");
    }

    @Override
    public Shop findMyShopByName(String username, String shopName) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'findMyShopByName'");
    }

    @Override
    public List<Food> addFoodToShop(String username, String shopName, List<Food> foods) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'addFoodToShop'");
    }

    @Override
    public void deleteFoodFromShop(String username, String shopName, int foodId) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'deleteFoodFromShop'");
    }

    @Override
    public Food adjustPrice(String username, String shopName, int foodId, double price) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'adjustPrice'");
    }

    @Override
    public List<Comment> findAllComments(String username, String shopName) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'findAllComments'");
    }

    // Implement other methods of the BMController interface

    // Implement other methods here...
}
