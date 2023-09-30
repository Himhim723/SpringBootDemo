package com.test.demotestjpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demotestjpa.entity.CustomerUser;


@Repository
public interface CustomerUserRepository extends JpaRepository<CustomerUser, String> {
}
