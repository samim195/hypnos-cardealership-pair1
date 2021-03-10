package com.hypnos.carDealership.controllers;

import com.hypnos.carDealership.models.Car;
import com.hypnos.carDealership.models.User;
import com.hypnos.carDealership.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/users")
    public ResponseEntity<?> createUser(@RequestBody @Valid User user) {
        return adminService.createUser(user);
    }

    @PostMapping("/cars")
    public ResponseEntity<?> createCar(@RequestBody @Valid Car car) {
        return adminService.createCar(car);
    }

    @DeleteMapping("/cars/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable Long id) {
        return adminService.deleteCar(id);
    }
}
