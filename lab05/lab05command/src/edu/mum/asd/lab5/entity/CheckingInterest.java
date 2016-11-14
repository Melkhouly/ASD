package edu.mum.asd.lab5.entity;

import java.math.BigDecimal;

public class CheckingInterest implements Interest {

	@Override
	public BigDecimal calculateInterest(Account a) {
		BigDecimal interest;
		
		if (a.getBalance().compareTo(BigDecimal.valueOf(1000)) < 0) {
			interest = a.getBalance().multiply(new BigDecimal(0.01));
		} else {
			interest = a.getBalance().multiply(new BigDecimal(0.05));
		}
		return interest;
		
	}

}
