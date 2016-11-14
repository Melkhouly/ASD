package edu.mum.asd.lab5.service;

import java.math.BigDecimal;

import edu.mum.asd.lab5.entity.Account;

public class TransferFundsCommand implements Command<Account, Double> {

	Account source;
	Account target;
	Double amount;
	Boolean executed = false;

	public TransferFundsCommand(Account source, Account target, Double amount) {
		this.source = source;
		this.target = target;
		this.amount = amount;
	}
	
	@Override
	public void execute() {
		if (!executed) {
			source.withdraw(BigDecimal.valueOf(amount));
			target.deposit(BigDecimal.valueOf(amount));
			executed = true;
		}
	}

	@Override
	public void undo() {
		if (executed) {
			target.withdraw(BigDecimal.valueOf(amount));
			source.deposit(BigDecimal.valueOf(amount));
			executed = false;
		}
	}

}
