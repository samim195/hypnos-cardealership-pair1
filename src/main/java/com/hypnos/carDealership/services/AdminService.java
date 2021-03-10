package com.hypnos.carDealership.services;

import com.hypnos.carDealership.models.Car;
import com.hypnos.carDealership.models.User;
import com.hypnos.carDealership.repositories.CarRepository;
import com.hypnos.carDealership.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CarRepository carRepository;

    public ResponseEntity<?> createUser(User user) {
        userRepository.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<?> createCar(Car car) {
        carRepository.save(car);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<?> deleteCar(Long id) {
        Optional<Car> car = carRepository.findById(id);
        if(car.isEmpty()) return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        carRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
