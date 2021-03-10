package com.hypnos.carDealership.repositories;

import com.hypnos.carDealership.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
