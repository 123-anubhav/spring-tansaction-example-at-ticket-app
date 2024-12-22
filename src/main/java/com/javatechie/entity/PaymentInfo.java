package com.javatechie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PAYMENT_INFO")
public class PaymentInfo {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	private String paymentId;
	private double amount;
	private String cardType;
	private String accountNo;
	private Long passengerId;

	public PaymentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentInfo(String paymentId, double ammount, String creditType, String accountNo, Long passengerId) {
		super();
		this.paymentId = paymentId;
		this.amount = ammount;
		this.cardType = creditType;
		this.accountNo = accountNo;
		this.passengerId = passengerId;
	}

	@Override
	public String toString() {
		return "PaymentInfo [paymentId=" + paymentId + ", amount=" + amount + ", cardType=" + cardType
				+ ", accountNo=" + accountNo + ", passengerId=" + passengerId + "]";
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double ammount) {
		this.amount = ammount;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String creditType) {
		this.cardType = creditType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Long getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}

}
