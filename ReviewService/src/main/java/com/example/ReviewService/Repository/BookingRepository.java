package com.example.ReviewService.Repository;

import com.example.ReviewService.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {

}
