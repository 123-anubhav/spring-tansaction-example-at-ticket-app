package com.javatechie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.dto.FlightBookingAcknowledgement;
import com.javatechie.dto.FlightBookingRequest;
import com.javatechie.service.FlightBookingService;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class TransactionApplication {

	@Autowired
	private FlightBookingService service;

	@PostMapping("/bookFlightTicket")
	public FlightBookingAcknowledgement bookFlightticket(@RequestBody FlightBookingRequest request) {
		System.out.println("data is :" + request);
		return service.bookFlightTicket(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(TransactionApplication.class, args);
	}

}
