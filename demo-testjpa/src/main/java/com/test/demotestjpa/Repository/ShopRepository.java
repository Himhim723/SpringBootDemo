package com.test.demotestjpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demotestjpa.entity.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
}

