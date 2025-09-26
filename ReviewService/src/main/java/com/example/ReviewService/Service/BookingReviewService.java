package com.example.ReviewService.Service;

import com.example.ReviewService.Entity.BookingReview;
import com.example.ReviewService.Repository.ReviewReposiotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BookingReviewService implements CommandLineRunner {


    private ReviewReposiotory reviewReposiotory;

    public BookingReviewService(ReviewReposiotory reviewReposiotory){
        this.reviewReposiotory = reviewReposiotory;
    }

    @Override
    public void run(String... args) throws Exception {
        BookingReview bookingReview = BookingReview.builder()
                .comments("awesome exprereince").ratings(4.5)
        .build();

        reviewReposiotory.save(bookingReview);

        reviewReposiotory.findAll();
    }
}
