package com.example.ReviewService.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity

public class BookingReview extends BaseModel {
    private String comments;

    @Column(nullable = false)
    private Double ratings;

    @OneToOne(mappedBy = "review")
    private Booking booking;

    @Override
    public String toString() {
        return "BookingReview{" +
                "comments='" + comments + '\'' +
                ", ratings=" + ratings +
                ", id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
