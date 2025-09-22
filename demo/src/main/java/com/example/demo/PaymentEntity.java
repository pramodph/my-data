package com.example.demo;

public class PaymentEntity {
	
	private Long id;
	private double paymentAmount;
	private String paymentCurrency;
	private String userEmail;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentCurrency() {
		return paymentCurrency;
	}
	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	@Override
	public String toString() {
		return "PaymentEntity [id=" + id + ", paymentAmount=" + paymentAmount + ", paymentCurrency=" + paymentCurrency
				+ ", userEmail=" + userEmail + "]";
	}

	
	
}
