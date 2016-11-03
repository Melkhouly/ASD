package org.lab02.service;

import java.util.List;

import org.lab02.model.Account;

public interface AccountService {

	public void createAccount(Account account);

	public void deposit(Account account, double amount);

	public void withDraw(Account account, double amount);

	public void  transferFunds(Account oldAccount, Account newAccount, double amount);

	public Account getAccount(String accountNumber);

	public List<Account> getAllAccount();

}
