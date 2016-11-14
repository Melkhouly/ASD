package edu.mum.asd.lab5.service;

import java.util.List;

import edu.mum.asd.lab5.entity.Account;

public interface AccountService {

	public void createAccount(Account a);
	public void deposit(Account a, double amount);
	public void withdraw(Account account, double amount);
	public void transferFunds(Account source, Account target, double amount);
	public List<Account> getAllAccounts();
	public Account getAccount(String accNo);
	void undoLastTransaction(Account account);

	void redoLastTransaction(Account account);
	
}
