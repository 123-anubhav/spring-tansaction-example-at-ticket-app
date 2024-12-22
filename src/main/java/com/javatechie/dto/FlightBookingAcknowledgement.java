package com.javatechie.dto;

import com.javatechie.entity.PassengerInfo;

public class FlightBookingAcknowledgement {

	private String pnrNo;
	private String status;
	private double totalFare;
	private PassengerInfo passengerInfo;

	public String getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}

	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

	public FlightBookingAcknowledgement(String pnrNo, String status, double totalFare, PassengerInfo passengerInfo) {
		super();
		this.pnrNo = pnrNo;
		this.status = status;
		this.totalFare = totalFare;
		this.passengerInfo = passengerInfo;
	}

	public FlightBookingAcknowledgement() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FlightBookingAcknowledgement [pnrNo=" + pnrNo + ", status=" + status + ", totalFare=" + totalFare
				+ ", passengerInfo=" + passengerInfo + "]";
	}

}
