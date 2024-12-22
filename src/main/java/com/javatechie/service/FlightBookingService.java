package com.javatechie.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mapping.AccessOptions.SetOptions.Propagation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;

import com.javatechie.dto.FlightBookingAcknowledgement;
import com.javatechie.dto.FlightBookingRequest;
import com.javatechie.entity.PassengerInfo;
import com.javatechie.entity.PaymentInfo;
import com.javatechie.repository.PassengerInfoRepo;
import com.javatechie.repository.PaymentInfoRepo;
import com.javatechie.util.PaymentUtils;

@Service
public class FlightBookingService {
	@Autowired
	private PassengerInfoRepo passengerInfoRepo;

	@Autowired
	private PaymentInfoRepo paymentInfoRepo;

	@Transactional // (readOnly = false, isolation=Isolation.READ_COMMITTED,
					// propagation=Propagation.Required)
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {

		PassengerInfo passengerInfo = request.getPassengerInfo();
		passengerInfo = passengerInfoRepo.save(passengerInfo);

		PaymentInfo paymentInfo = request.getPaymentInfo();
		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());

		paymentInfo.setPassengerId(passengerInfo.getPid());
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentInfoRepo.save(paymentInfo);

		return new FlightBookingAcknowledgement(UUID.randomUUID().toString().split("-")[0], "SUCCESS",
				passengerInfo.getFare(), passengerInfo);

	}
}
