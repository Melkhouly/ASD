package org.lab01.dao;

import java.util.List;

import org.lab01.model.Account;

public class AccontDaoImp implements AccountDao {

	@Override
	public void saveAccount(Account account) {
		System.out.println(account);

	}

	@Override
	public void updateAccount(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account loadAccount(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

}
