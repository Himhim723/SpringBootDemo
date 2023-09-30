package com.test.demotestjpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demotestjpa.entity.BusinessUser;


@Repository
public interface BusinessUserRepository extends JpaRepository<BusinessUser, String> {
}
