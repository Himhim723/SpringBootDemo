package com.openrice.demoopenrice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openrice.demoopenrice.entity.CMember;

public interface CMemberRepository extends JpaRepository<CMember,String>{
  
}
