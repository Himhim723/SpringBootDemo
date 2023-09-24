// package com.openrice.demoopenrice.service.Imp;

// import java.util.List;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PatchMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;

// import com.openrice.demoopenrice.entity.CMember;
// import com.openrice.demoopenrice.entity.Shop;
// import com.openrice.demoopenrice.model.Booking;
// import com.openrice.demoopenrice.model.Comment;

// public interface CustomerService {
//   CMember signUp( CMember member);
//   CMember adjustInfo(String usernmae,CMember member);
//   void deleteAccount(String usernmae);
//   void adjustPassword(String usernmae, String password);
//   List<Shop> findAllShops();
//   Shop findShopByName(String name);
//   List<Shop> findMyFavShops(String usernmae);
//   Shop addMyFavShop (String usernmae, String shopName);
//   void deleteMyFavShop (String usernmae, String shopName);
//   Booking bookResturant (String usernmae, String shopName);
//   void deleteBooking (String usernmae, String shopName);
//   List<Comment> findAllComments(String shopName);
// }
