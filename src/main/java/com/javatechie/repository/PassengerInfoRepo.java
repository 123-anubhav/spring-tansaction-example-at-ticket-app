package com.javatechie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.entity.PassengerInfo;

public interface PassengerInfoRepo extends JpaRepository<PassengerInfo, Long> {

}
