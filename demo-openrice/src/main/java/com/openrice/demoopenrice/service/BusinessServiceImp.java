// package com.openrice.demoopenrice.service;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.openrice.demoopenrice.entity.BMember;
// import com.openrice.demoopenrice.entity.Member;
// import com.openrice.demoopenrice.entity.Shop;
// import com.openrice.demoopenrice.model.Comment;
// import com.openrice.demoopenrice.model.Food;
// import com.openrice.demoopenrice.repository.BMemberRepository;
// // import com.openrice.demoopenrice.repository.CMemberRepository;
// import com.openrice.demoopenrice.repository.MemberRepository;
// import com.openrice.demoopenrice.repository.ShopRepository;
// import com.openrice.demoopenrice.service.Imp.BusinessService;

// import jakarta.transaction.Transactional;

// @Service
// public class BusinessServiceImp implements BusinessService{

//   @Autowired
//   private ShopRepository shopRepository;
//   @Autowired
//   private BMemberRepository businessRepository;
//   @Autowired
//   private MemberRepository memberRepository;

//   @Override //success
//   public BMember signUp(BMember member) {
//     if(memberRepository.findById(member.getUsername()).isEmpty()){
//     memberRepository.save(new Member(member.getUsername(),member.getPassword(),1));
//     member.setMyShops(new ArrayList<>());
//     return businessRepository.save(member);
//     } else throw new IllegalAccessError("Account has been registered");
//   }

//   @Override //success
//   public void deleteAccount(String usernmae) {
//     BMember b = businessRepository.findById(usernmae).orElseThrow(()-> new IllegalAccessError("Account Does not Exist"));
//     memberRepository.deleteById(usernmae);
//     businessRepository.deleteById(usernmae);
//   }

//   @Override 
//   public void adjustPassword(String usernmae, String password) {
//     BMember b = businessRepository.findById(usernmae).orElseThrow(()-> new IllegalAccessError("Account Does not Exist"));
//     Member a = memberRepository.findById(usernmae).get();
//     a.setPassword(password);
//     b.setPassword(password);
//     memberRepository.save(a);
//     businessRepository.save(b);
//   }

//   @Override
//   public Shop addShop(String username, Shop shop) {
//     BMember b = businessRepository.findById(username).orElseThrow(() 
//     -> new IllegalAccessError("Account Does not Exist"));
//     shop.setUser(b);
//     // 再保存 Shop 物件
//     return shopRepository.save(shop);
//   }

//   @Override
//   public List<Shop> findMyShops(String username) {
//     return shopRepository.findShopsByUser(username);
//   }

//   @Override
//   public Shop findMyShopByName(String usernmae, String shopName) {
//     return findMyShops(usernmae).stream().filter(e->e.getName()==shopName)
//     .findAny().get();
//   }

//   @Override
//   public List<Food> addFoodToShop(String usernmae, String shopName, List<Food> foods) {
//     findMyShopByName(usernmae, shopName).setMenu(foods);
//     shopRepository.save(findMyShopByName(usernmae, shopName));
//     businessRepository.save(businessRepository.findById(shopName).get());
//     return findMyShopByName(usernmae, shopName).getMenu();
//   }

//   @Override
//   public void deleteFoodFromShop(String usernmae, String shopName, int foodId) {
//     findMyShopByName(usernmae, shopName).getMenu().removeIf(e->e.getId()==foodId);
//     shopRepository.save(findMyShopByName(usernmae, shopName));
//     businessRepository.save(businessRepository.findById(shopName).get());
//   }

//   @Override
//   public Food adjustPrice(String usernmae, String shopName, int foodId, double price) {
//     findMyShopByName(usernmae, shopName).getMenu().forEach(e->{
//       if(e.getId()==foodId)
//       e.setPrice(price);
//     });
//     shopRepository.save(findMyShopByName(usernmae, shopName));
//     businessRepository.save(businessRepository.findById(shopName).get());
//     return findMyShopByName(usernmae, shopName).getMenu().stream().filter(e->e.getId()==foodId).findAny().get();
//   }

//   @Override
//   public List<Comment> findAllComments(String usernmae, String shopName) {
//     return findMyShopByName(usernmae, shopName).getComments();
//   }
  


// }
