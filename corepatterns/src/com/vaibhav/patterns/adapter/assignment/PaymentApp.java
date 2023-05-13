package com.vaibhav.patterns.adapter.assignment;

public class PaymentApp {

	public void pay(double rupees) {
		PaymentAdapter pd = new PaymentAdapter();
		double dollerValue = pd.currencyConvertor(rupees);

		PaymentProcessor p = new PaymentProcessorImpl();
		p.pay(dollerValue);

	}

	public static void main(String[] args) {
		PaymentApp p = new PaymentApp();
		p.pay(11000);
	}
}
