package com.test.demotestjpa.Service;

import java.util.List;

import com.test.demotestjpa.entity.Shop;

public interface ShopService {
    Shop addShop(String username, Shop shop);
    List<Shop> findMyShops(String username);
    Shop findMyShopByName(String username, String shopName);
}
