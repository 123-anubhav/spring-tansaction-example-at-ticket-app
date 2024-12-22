package com.javatechie.util;

import java.util.HashMap;
import java.util.Map;

import com.javatechie.exception.InsufficientAmmountException;

public class PaymentUtils {

	private static Map<String, Double> paymentMap = new HashMap<>();

	static {
		paymentMap.put("acc1", 12000.00);
		paymentMap.put("acc2", 10000.00);
		paymentMap.put("acc3", 5000.00);
		paymentMap.put("acc4", 8000.00);
	}

	public static boolean validateCreditLimit(String accNo, double paidAmmount) {
		if (paidAmmount > paymentMap.get(accNo)) {

			throw new InsufficientAmmountException("Isufficient account balance...!");
		} else
			return true;

	}
}
