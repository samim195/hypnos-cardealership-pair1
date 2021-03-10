package com.hypnos.carDealership.repositories;

import com.hypnos.carDealership.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}
