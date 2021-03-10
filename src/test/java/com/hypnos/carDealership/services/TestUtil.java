package com.hypnos.carDealership.services;

import com.hypnos.carDealership.enums.Brand;
import com.hypnos.carDealership.enums.Colour;
import com.hypnos.carDealership.enums.Role;
import com.hypnos.carDealership.models.Car;
import com.hypnos.carDealership.models.User;

public class TestUtil {

    public static User getDummyUser() {
        return new User("test", "test2", Role.USER);
    }

    public static Car getDummyCar() {
        return new Car(Brand.AUDI, Colour.BLACK, "2020", 10000, 3.2, false);
    }
}
