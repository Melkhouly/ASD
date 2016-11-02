package org.lab01.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

	private String accountNumber;
	private double balance;
	private Interest interest;
	private List<AccountEntry> accountEntryList = new ArrayList<>();
	private Customer customer ;
	
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<AccountEntry> getAccountEntryList() {
		return accountEntryList;
	}

	public void setAccountEntryList(List<AccountEntry> accountEntryList) {
		this.accountEntryList = accountEntryList;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", interest=" + interest
				+ ", accountEntryList=" + accountEntryList + ", customer=" + customer + "]";
	}
	
	
	

}
