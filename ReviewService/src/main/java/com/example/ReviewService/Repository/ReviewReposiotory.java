package com.example.ReviewService.Repository;

import com.example.ReviewService.Entity.BookingReview;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewReposiotory extends JpaRepository<BookingReview,Long> {
}
