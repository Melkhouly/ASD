package org.lab01.service;

import java.util.List;

import org.lab01.dao.AccontDaoImp;
import org.lab01.dao.AccountDao;
import org.lab01.model.Account;
import org.lab01.model.AccountEntry;

public class AccountServiceImpl implements AccountService {

	AccountDao accountDao;
	public AccountServiceImpl(){
		accountDao= new AccontDaoImp();
	}
	
	@Override
	public void createAccount(Account account) {
		accountDao.saveAccount(account);

	}

	@Override
	public void deposit(Account account, double amount) {
		
		account.setBalance(account.getBalance()+amount);
		account.getAccountEntryList().add(new AccountEntry());
		accountDao.updateAccount(account);
		
	}

	@Override
	public void withDraw(Account account, double amount) {
		account.setBalance(account.getBalance()-amount);
		account.getAccountEntryList().add(new AccountEntry());
		accountDao.updateAccount(account);
	
	}

	@Override
	public void  transferFunds(Account oldAccount, Account newAccount, double amount) {
	
		
	}

	@Override
	public Account getAccount(String accountNumber) {
		return accountDao.loadAccount(accountNumber) ;
	}

	@Override
	public List<Account> getAllAccount() {
		// TODO Auto-generated method stub
		return 	accountDao.getAccounts();
	}

}
