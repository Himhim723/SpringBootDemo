package com.test.demotestjpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demotestjpa.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
