package com.javatechie.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.javatechie.entity.PassengerInfo;
import com.javatechie.entity.PaymentInfo;

public final class FlightBookingRequest {

	private PaymentInfo paymentInfo;

	private PassengerInfo passengerInfo;

	public FlightBookingRequest(PaymentInfo paymentInfo, PassengerInfo passengerInfo) {
		super();
		this.paymentInfo = paymentInfo;
		this.passengerInfo = passengerInfo;
	}

	public FlightBookingRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	@JsonProperty(value = "PAYMENT_INFO")
	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}

	@JsonProperty(value = "PESSANGER_INFO")
	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

	@Override
	public String toString() {
		return "FlightBookingInfo [paymentInfo=" + paymentInfo + ", passengerInfo=" + passengerInfo + "]";
	}

}
