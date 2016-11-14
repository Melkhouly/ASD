package edu.mum.asd.lab5.dataaccess;

import java.util.List;

import edu.mum.asd.lab5.entity.Account;

public interface AccountDAO {

	public void createAccount(Account a);
	public void deposit();
	public void withdraw();
	public void transferFunds();
	public List<Account> getAllAccounts();
	public Account getAccount(String accountNumber);
	void updateAccount(Account account);


	
	
}
