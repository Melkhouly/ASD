package edu.mum.asd.lab5.service;

import java.math.BigDecimal;

import edu.mum.asd.lab5.entity.Account;

public class WithDrawCommand implements Command<Account, Double> {

	Account account;
	Double amount;
	Boolean executed = false;

	public WithDrawCommand(Account account, Double amount) {
		this.account = account;
		this.amount = amount;
	}

	
	@Override
	public void execute() {
		if (!executed) {
			account.withdraw(BigDecimal.valueOf(amount));
			executed = true;
		}
	}

	@Override
	public void undo() {
		if (executed) {
			account.deposit(BigDecimal.valueOf(amount));
			executed = false;
		}
	}

}
