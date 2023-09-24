// package com.openrice.demoopenrice.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.openrice.demoopenrice.controller.imp.BMController;
// import com.openrice.demoopenrice.entity.BMember;
// import com.openrice.demoopenrice.entity.Shop;
// import com.openrice.demoopenrice.model.Comment;
// import com.openrice.demoopenrice.model.Food;
// import com.openrice.demoopenrice.repository.BMemberRepository;
// import com.openrice.demoopenrice.service.Imp.BusinessService;

// @RestController
// @RequestMapping(value = "/v1/business")
// public class BMOperation implements BMController {

//   @Autowired
//   BusinessService businessService;
//   @Autowired
//   BMemberRepository bMemberRepository;

//   @Override
//   public BMember signUp(BMember member) {
//     return businessService.signUp(member);
//   }

//   // test
//   @GetMapping(value = "/getUser/{username}")
//   public BMember get(@PathVariable String username){
//     return bMemberRepository.findById(username).get();
//   }


//   @Override
//   public void deleteAccount(String username) {
//     businessService.deleteAccount(username);
//   }

//   @Override
//   public void adjustPassword(String username, String password) {
//     businessService.adjustPassword(username, password);
//   }

//   @Override
//   public Shop addShop(String username, Shop shop) {
//     return businessService.addShop(username, shop);
//   }

//   @Override
//   public List<Shop> findMyShops(String username) {
//     return businessService.findMyShops(username);
//   }

//   @Override
//   public Shop findMyShopByName(String username, String shopName) {
//     return businessService.findMyShopByName(username, shopName);
//   }

//   @Override
//   public List<Food> addFoodToShop(String username, String shopName, List<Food> foods) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'addFoodToShop'");
//   }

//   @Override
//   public void deleteFoodFromShop(String username, String shopName, int foodId) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'deleteFoodFromShop'");
//   }

//   @Override
//   public Food adjustPrice(String username, String shopName, int foodId, double price) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'adjustPrice'");
//   }

//   @Override
//   public List<Comment> findAllComments(String username, String shopName) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'findAllComments'");
//   }

//   @GetMapping(value = "/hello")
//   public String hello(){
//     return "hello";
//   }

// }