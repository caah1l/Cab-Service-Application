package com.example.ReviewService.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class Driver extends BaseModel{
    private String name;

    @Column(nullable = false,unique = true)
    private String licenseNo;

    @Column(nullable = false,unique = true)
    private String vehicleNo;

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings = new ArrayList<>();
}
