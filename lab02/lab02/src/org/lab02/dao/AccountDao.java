package org.lab02.dao;

import java.util.List;

import org.lab02.model.Account;

public interface AccountDao {

	public void saveAccount(Account account);

	public void updateAccount(Account account);

	public Account loadAccount(String accountNumber);

	public List<Account> getAccounts();

}
