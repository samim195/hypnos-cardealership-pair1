package com.hypnos.carDealership.repositories;

import com.hypnos.carDealership.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
