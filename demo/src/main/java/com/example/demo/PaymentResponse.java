package com.example.demo;

public class PaymentResponse {
	private Long paymentId;
	private double amount;
	private String currrency;
	
	
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCurrrency() {
		return currrency;
	}
	public void setCurrrency(String currrency) {
		this.currrency = currrency;
	}
	@Override
	public String toString() {
		return "PaymentResponse [paymentId=" + paymentId + ", amount=" + amount + ", currrency=" + currrency + "]";
	}
	
	

}
