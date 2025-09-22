package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {
// execute query to get payment Details by Id
	public PaymentEntity getPaymentbyId(PaymentRequest internalRequestObj) {
		// TODO Auto-generated method stub
		PaymentEntity paymentModel = new PaymentEntity();
		paymentModel.setId(internalRequestObj.getPaymentId());
		paymentModel.setPaymentAmount(1000);
		paymentModel.setPaymentCurrency("INR");
		return paymentModel;
	}
}
