// package com.openrice.demoopenrice.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.openrice.demoopenrice.entity.BMember;
// import com.openrice.demoopenrice.entity.CMember;
// import com.openrice.demoopenrice.entity.Member;
// import com.openrice.demoopenrice.entity.Shop;
// import com.openrice.demoopenrice.exception.AccountExistedException;
// import com.openrice.demoopenrice.model.Booking;
// import com.openrice.demoopenrice.model.Comment;
// import com.openrice.demoopenrice.repository.CMemberRepository;
// import com.openrice.demoopenrice.repository.MemberRepository;
// import com.openrice.demoopenrice.repository.ShopRepository;
// import com.openrice.demoopenrice.service.Imp.CustomerService;

// @Service
// public class CustomerServiceImp implements CustomerService{
  
//   @Autowired
//   private MemberRepository memberRepository;
//   @Autowired
//   private CMemberRepository customerRepository;
//   @Autowired
//   private ShopRepository shopRepository;
//   @Override
//   public CMember signUp(CMember member) {
//     if(memberRepository.findById(member.getUsername()).isEmpty()){
//       memberRepository.save(new Member(member.getUsername(),member.getPassword(),0));
//       return customerRepository.save(member);
//       } else throw new IllegalAccessError("Account has been registered");
//     }
//   @Override
//   public CMember adjustInfo(String usernmae, CMember member) {
//     memberRepository.save(new Member(usernmae, member.getPassword(), 0));
//     return customerRepository.save(member);
//   }
//   @Override
//   public void deleteAccount(String usernmae) {
//     CMember member = customerRepository.findById(usernmae).orElseThrow(()-> new IllegalAccessError("Account Does not Exist"));
//     memberRepository.deleteById(usernmae);
//     customerRepository.deleteById(usernmae);
//   }
//   @Override
//   public void adjustPassword(String usernmae, String password) {
//     CMember customer = customerRepository.findById(usernmae).orElseThrow(()-> new IllegalAccessError("Account Does not Exist"));
//     Member member = memberRepository.findById(usernmae).get();
//     member.setPassword(password);
//     customer.setPassword(password);
//     memberRepository.save(member);
//     customerRepository.save(customer);
//   }
//   @Override
//   public List<Shop> findAllShops() {
//     return shopRepository.findAll();
//   }
//   @Override
//   public Shop findShopByName(String name) {
//     return shopRepository.findById(name).get();
//   }
//   @Override
//   public List<Shop> findMyFavShops(String usernmae) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'findMyFavShops'");
//   }
//   @Override
//   public Shop addMyFavShop(String usernmae, String shopName) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'addMyFavShop'");
//   }
//   @Override
//   public void deleteMyFavShop(String usernmae, String shopName) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'deleteMyFavShop'");
//   }
//   @Override
//   public Booking bookResturant(String usernmae, String shopName) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'bookResturant'");
//   }
//   @Override
//   public void deleteBooking(String usernmae, String shopName) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'deleteBooking'");
//   }
//   @Override
//   public List<Comment> findAllComments(String shopName) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'findAllComments'");
//   }

// }
