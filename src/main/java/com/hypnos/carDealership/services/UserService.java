package com.hypnos.carDealership.services;

import com.hypnos.carDealership.models.Car;
import com.hypnos.carDealership.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private CarRepository carRepository;

    public ResponseEntity<?> getAllCars() {
        return new ResponseEntity<>(carRepository.findAll(), HttpStatus.OK);
    }
}
