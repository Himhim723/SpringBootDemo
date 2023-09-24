// package com.openrice.demoopenrice.controller.imp;

// import java.util.List;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PatchMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;

// import com.openrice.demoopenrice.entity.BMember;
// import com.openrice.demoopenrice.entity.Shop;
// import com.openrice.demoopenrice.model.Comment;
// import com.openrice.demoopenrice.model.Food;

// public interface BMController {
//   @PostMapping(value = "/signUp") //success
//   BMember signUp(@RequestBody BMember member);

//   @DeleteMapping(value = "/home/{username}")  //success
//   void deleteAccount(@PathVariable String username);

//   @PatchMapping(value = "/home/{username}") //success
//   void adjustPassword(@PathVariable String username,@RequestParam String password);

//   @PostMapping(value = "/home/{username}/shop") //half success (cannot add shop in List of shop of business memeber)
//   // but shop has been added to shop repository successfully
//   Shop addShop (@PathVariable String username,@RequestBody Shop shop);

//   @GetMapping(value = "/home/{username}/shops") // half success (no shop exist)
//   List<Shop> findMyShops(@PathVariable String username);

//   @GetMapping(value = "/home/{username}/shop/{shopName}") 
//   Shop findMyShopByName(@PathVariable String username,@PathVariable String shopName);

//   @PostMapping(value = "/home/user/{username}/shop/{shopName}")
//   List<Food> addFoodToShop(@PathVariable String username,@PathVariable String shopName,@RequestBody List<Food> foods);

//   @DeleteMapping(value = "/home")
//   void deleteFoodFromShop(@RequestParam String username,@RequestParam String shopName,@RequestParam int foodId);

//   @PatchMapping(value = "/home")
//   Food adjustPrice(@RequestParam String username,@RequestParam String shopName,@RequestParam int foodId,@RequestParam double price);

//   @GetMapping(value = "/home/user/{username}/shop/{shop}/comment")
//   List<Comment> findAllComments(@PathVariable String username,@PathVariable String shopName);

// }
