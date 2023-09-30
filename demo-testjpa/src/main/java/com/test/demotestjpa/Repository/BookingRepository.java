package com.test.demotestjpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demotestjpa.entity.Booking;


@Repository
public interface BookingRepository extends JpaRepository<Booking, String> {
}
