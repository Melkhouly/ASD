package edu.mum.asd.lab5.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public abstract class Account  {
	
	ObserverComposition observerComposition;
	public Account(){
		 observerComposition = new ObserverComposition();
		observerComposition.registerUpdatedObserver(new Logger());
		observerComposition.registerUpdatedObserver(new SMSSender());
		observerComposition.registerCreatedObserver(new EmailSender());
		observerComposition.notifyCreatedObservers();
		
		}
	
	private String accountNumber;
	private BigDecimal balance;
	Interest interest;
	private List<AccountEntry> accountEntries = new ArrayList<AccountEntry>();

	
	

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public List<AccountEntry> getAccountEntries() {
		return accountEntries;
	}

	public void setAccountEntries(List<AccountEntry> accountEntries) {
		this.accountEntries = accountEntries;
	}

	public void deposit(BigDecimal amount) {
		if (amount.compareTo(BigDecimal.valueOf(0.0)) <= 0) {
			throw new IllegalArgumentException("Invalid withdraw amount.");
		}

		this.setBalance(this.balance.add(amount));
		AccountEntry accountEntry = new AccountEntry();
		accountEntry.setAmount(amount);
		accountEntry.setDate(new Date());
		accountEntry.setDescription("Deposit is performed.");
		this.accountEntries.add(accountEntry);
	}

	public void withdraw(BigDecimal amount) {
		if (amount.compareTo(this.getBalance()) < 0) {
			throw new IllegalArgumentException("Requested amount greater than balance.");
		}
		this.setBalance(this.balance.subtract(amount));
		AccountEntry accountEntry = new AccountEntry();
		accountEntry.setAmount(amount);
		accountEntry.setDate(new Date());
		accountEntry.setDescription("Withdraw is performed.");
		this.accountEntries.add(accountEntry);
	}

	

	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public void setInterest(Interest interest) {
		this.interest = interest;
	}
	
	
	
	
	

}
