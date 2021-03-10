package com.hypnos.carDealership.services;

import com.hypnos.carDealership.repositories.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.hypnos.carDealership.services.TestUtil.getDummyCar;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private AdminService adminService;

    @Test
    public void shouldReturnAllCarsFromDb() {
        System.out.println(carRepository.findAll());
        adminService.createCar(getDummyCar());
        adminService.createCar(getDummyCar());
        assertThat(carRepository.findAll().size()).isEqualTo(2);
    }


}
