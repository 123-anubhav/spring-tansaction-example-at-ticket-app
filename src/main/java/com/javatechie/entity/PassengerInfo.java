package com.javatechie.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

@Entity
@Table(name = "PESSANGER_INFO")
public class PassengerInfo {

	@Id
	@GeneratedValue
	private Long pid;
	private String name;
	private String email;
	private String info;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
	private Date travelDate;
	private String pickuptime;
	private String source;
	private String destination;
	private String arrivalTime;
	private Double fare;

	public PassengerInfo(Long pid, String name, String email, String info, Date travelDate, String pichuptime,
			String source, String destination, String arrivalTime, Double fare) {
		super();
		this.pid = pid;
		this.name = name;
		this.email = email;
		this.info = info;
		this.travelDate = travelDate;
		this.pickuptime = pichuptime;
		this.source = source;
		this.destination = destination;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
	}

	public PassengerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getPickuptime() {
		return pickuptime;
	}

	public void setPickuptime(String pichuptime) {
		this.pickuptime = pichuptime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "PassengerInfo [pid=" + pid + ", name=" + name + ", email=" + email + ", info=" + info + ", travelDate="
				+ travelDate + ", pickuptime=" + pickuptime + ", source=" + source + ", destination=" + destination
				+ ", arrivalTime=" + arrivalTime + ", fare=" + fare + "]";
	}

}
