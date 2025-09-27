package com.example.ReviewService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Booking extends BaseModel {

    @OneToOne
    private BookingReview review;
    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;
    private Date startTime;
    private Date endTime;
    private Long totalDistance;

}
