package com.example.ReviewService.Service;

import com.example.ReviewService.Entity.Booking;
import com.example.ReviewService.Entity.BookingReview;
import com.example.ReviewService.Entity.BookingStatus;
import com.example.ReviewService.Repository.BookingRepository;
import com.example.ReviewService.Repository.ReviewReposiotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BookingReviewService implements CommandLineRunner {


    private ReviewReposiotory reviewReposiotory;
    private BookingRepository bookingRepository;

    public BookingReviewService(ReviewReposiotory reviewReposiotory,BookingRepository bookingRepository){
        this.reviewReposiotory = reviewReposiotory;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        BookingReview bookingReview = BookingReview.builder()
                .comments("testing").ratings(4.5)
        .build();

       // reviewReposiotory.save(bookingReview);

        Booking booking = Booking.builder()
                .bookingStatus(BookingStatus.APPROVED)
                .review(bookingReview)
                //.startTime(new Date())
                .build();

        bookingRepository.save(booking);

        reviewReposiotory.findAll();
    }
}
