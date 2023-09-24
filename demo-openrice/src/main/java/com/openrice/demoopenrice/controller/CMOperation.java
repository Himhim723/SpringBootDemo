// package com.openrice.demoopenrice.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.openrice.demoopenrice.controller.imp.CMController;
// import com.openrice.demoopenrice.entity.CMember;
// import com.openrice.demoopenrice.entity.Shop;
// import com.openrice.demoopenrice.model.Booking;
// import com.openrice.demoopenrice.model.Comment;
// import com.openrice.demoopenrice.service.Imp.CustomerService;

// @RestController
// @RequestMapping(value = "/v1/customer")
// public class CMOperation implements CMController {

//   @Autowired
//   private CustomerService customerService;

//   @Override
//   public CMember signUp(CMember member) {
//     return customerService.signUp(member);
//   }

//   @Override
//   public CMember adjustInfo(String username, CMember member) {
//     return customerService.adjustInfo(username, member);
//   }

//   @Override
//   public void deleteAccount(String username) {
//     customerService.deleteAccount(username);
//   }

//   @Override
//   public void adjustPassword(String username, String password) {
//     customerService.adjustPassword(username, password);
//   }

//   @Override
//   public List<Shop> findAllShops() {
//     return customerService.findAllShops();
//   }

//   @Override
//   public Shop findShopByName(String name) {
//     return customerService.findShopByName(name);
//   }

//   @Override
//   public List<Shop> findMyFavShops(String username) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'findMyFavShops'");
//   }

//   @Override
//   public Shop addMyFavShop(String username, String shopName) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'addMyFavShop'");
//   }

//   @Override
//   public void deleteMyFavShop(String username, String shopName) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'deleteMyFavShop'");
//   }

//   @Override
//   public Booking bookResturant(String username, String shopName) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'bookResturant'");
//   }

//   @Override
//   public void deleteBooking(String username, String shopName) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'deleteBooking'");
//   }

//   @Override
//   public List<Comment> findAllComments(String shopName) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'findAllComments'");
//   }
  
// }
