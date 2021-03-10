package com.hypnos.carDealership.controllers;

import com.hypnos.carDealership.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/cars")
    public ResponseEntity<?> getAllCars () {
        return new ResponseEntity<>(userService.getAllCars(), HttpStatus.OK);
    }
}
