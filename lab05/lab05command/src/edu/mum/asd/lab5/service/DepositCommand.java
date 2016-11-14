package edu.mum.asd.lab5.service;

import java.math.BigDecimal;

import edu.mum.asd.lab5.entity.Account;

public class DepositCommand implements Command<Account, Double> {

	
	Account account;
	Double amount;
	Boolean executed = false;

	public DepositCommand(Account account, Double amount) {
		this.account = account;
		this.amount = amount;
	}

	
	
	@Override
	public void execute() {
		if (!executed) {
			account.deposit(BigDecimal.valueOf(amount));
			this.executed = true;
		}
	}

	@Override
	public void undo() {
		if (executed) {
			account.withdraw(BigDecimal.valueOf(amount));
			this.executed = false;
		}
	}

}
