package com.vaibhav.patterns.adapter.assignment;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public void pay(double doller) {
		System.out.println("Payment received : " + new BigDecimal(doller).setScale(2,RoundingMode.HALF_DOWN).doubleValue() + " dollers ");
	}
}
