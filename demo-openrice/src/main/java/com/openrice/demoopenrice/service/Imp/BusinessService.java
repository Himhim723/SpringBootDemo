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

// import com.openrice.demoopenrice.entity.BMember;
// import com.openrice.demoopenrice.entity.Shop;
// import com.openrice.demoopenrice.model.Comment;
// import com.openrice.demoopenrice.model.Food;

// public interface BusinessService{
//   BMember signUp( BMember member);
//   void deleteAccount( String usernmae);
//   void adjustPassword( String usernmae,String password);
//   Shop addShop ( String usernmae, Shop shop);
//   List<Shop> findMyShops( String usernmae);
//   Shop findMyShopByName( String usernmae, String shopName);
//   List<Food> addFoodToShop( String usernmae, String shopName, List<Food> foods);
//   void deleteFoodFromShop(String usernmae,String shopName,int foodId);
//   Food adjustPrice(String usernmae,String shopName,int foodId,double price);
//   List<Comment> findAllComments( String usernmae, String shopName);
// }
