package edu.mum.asd.lab5.dataaccess;

import java.util.ArrayList;
import java.util.List;

import edu.mum.asd.lab5.entity.Account;

public class AccountDAOImpl implements AccountDAO {

	List<Account> accounts = new ArrayList<Account>();

	@Override
	public void createAccount(Account a) {
		
		
	}

	@Override
	public void deposit() {
		
	}

	@Override
	public void withdraw() {

		
	}

	@Override
	public void transferFunds() {
	
		
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account getAccount(String accountNumber) {
		// TODO Auto-generated method stub
		Account found = null;
		found = accounts.stream().filter(account -> account.getAccountNumber().equals(accountNumber)).findFirst().get();
		return found;
	}

}
