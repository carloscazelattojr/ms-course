package br.com.carlosjunior.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.carlosjunior.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days ){
		return new Payment("Carlos", 175.1, days);
	}
}
