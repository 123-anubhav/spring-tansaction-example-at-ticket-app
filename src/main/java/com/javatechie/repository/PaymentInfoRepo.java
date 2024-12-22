package com.javatechie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.entity.PaymentInfo;

public interface PaymentInfoRepo extends JpaRepository<PaymentInfo, Long> {

}
