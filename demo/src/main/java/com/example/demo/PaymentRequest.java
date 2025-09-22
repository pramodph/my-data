package com.example.demo;

public class PaymentRequest {

	private long paymentId;

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	@Override
	public String toString() {
		return "PaymmentRequest [paymentId=" + paymentId + "]";
	}
	
	
}
