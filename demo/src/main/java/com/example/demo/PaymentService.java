package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	public PaymentResponse getPaymentDetailsById(PaymentRequest internalRequestObj) {
		
		PaymentEntity paymentModel =paymentRepository.getPaymentbyId(internalRequestObj);
		
		PaymentResponse paymentResponse =mapModelToResponsseDTO(paymentModel);
		return paymentResponse;
		
	}

	private PaymentResponse mapModelToResponsseDTO(PaymentEntity paymentModel) {
		PaymentResponse response=new PaymentResponse();
		response.setPaymentId(paymentModel.getId());
		response.setAmount(paymentModel.getPaymentAmount());
		response.setCurrrency(paymentModel.getPaymentCurrency());
		return response;
	}
}
