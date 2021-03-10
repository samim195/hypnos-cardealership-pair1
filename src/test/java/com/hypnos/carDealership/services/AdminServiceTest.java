package com.hypnos.carDealership.services;

import com.hypnos.carDealership.repositories.CarRepository;
import com.hypnos.carDealership.repositories.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static com.hypnos.carDealership.services.TestUtil.getDummyCar;
import static com.hypnos.carDealership.services.TestUtil.getDummyUser;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class AdminServiceTest {

    @Autowired
    private AdminService adminService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CarRepository carRepository;

    @BeforeEach
    public void setUp() {
        userRepository.deleteAll();
    }

    @Test
    public void shouldReturnOkWhenUserIsCreated() {
        HttpStatus httpStatus = adminService.createUser(getDummyUser()).getStatusCode();
        assertThat(httpStatus).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void shouldContainUserRecord() {
        adminService.createUser(getDummyUser());
        assertThat(userRepository.findAll().size()).isEqualTo(1);
    }

    @Test
    public void shouldReturnOkWhenCarIsCreated() {
        HttpStatus httpStatus = adminService.createCar(getDummyCar()).getStatusCode();
        assertThat(httpStatus).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void shouldContainCarInDatabase() {
        adminService.createCar(getDummyCar());
        assertThat(carRepository.findAll().size()).isEqualTo(1);
    }

    @Test
    public void shouldReturnOkWhenCarIsDeleted() {
        adminService.createCar(getDummyCar());
        HttpStatus httpStatus = adminService.deleteCar(1L).getStatusCode();
        assertThat(httpStatus).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void shouldRemoveCarFromDatabase() {
        adminService.createCar(getDummyCar());
        adminService.deleteCar(1L).getStatusCode();
        assertThat(carRepository.findAll().size()).isEqualTo(0);
    }

    @Test
    public void shouldReturnHttpStatusNotFoundWhenCarDoesNotExistInDatabase() {
        HttpStatus httpStatus = adminService.deleteCar(1L).getStatusCode();
        assertThat(httpStatus).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @AfterEach
    public void afterEach() {
        userRepository.deleteAll();
    }
}