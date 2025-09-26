package com.example.ReviewService.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DriverReview extends BookingReview {

    @Column(nullable = false)
    public Double driving;
    public String behaviour;
}
