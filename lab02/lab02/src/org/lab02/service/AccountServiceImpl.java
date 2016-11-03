package org.lab02.service;

import java.util.List;

import org.lab02.dao.AccontDaoImp;
import org.lab02.dao.AccountDao;
import org.lab02.model.Account;
import org.lab02.model.AccountEntry;

public class AccountServiceImpl implements AccountService {

	AccountDao accountDao;
	SubjectAccountServiceImp subjectAccountServiceImp;
	public AccountServiceImpl(){
		accountDao= new AccontDaoImp();
		subjectAccountServiceImp=  new SubjectAccountServiceImp();
	}
	
	
	
	@Override
	public void createAccount(Account account) {
		accountDao.saveAccount(account);
		subjectAccountServiceImp.notifyObserversCreation();

	}
	public SubjectAccountServiceImp getSubjectAccountServiceImp() {
		return subjectAccountServiceImp;
	}


	public void setSubjectAccountServiceImp(SubjectAccountServiceImp subjectAccountServiceImp) {
		this.subjectAccountServiceImp = subjectAccountServiceImp;
	}

	@Override
	public void deposit(Account account, double amount) {
		
		account.setBalance(account.getBalance()+amount);
		account.getAccountEntryList().add(new AccountEntry());
		accountDao.updateAccount(account);
		subjectAccountServiceImp.notifyObserversChanging();
		
	}

	@Override
	public void withDraw(Account account, double amount) {
		account.setBalance(account.getBalance()-amount);
		account.getAccountEntryList().add(new AccountEntry());
		accountDao.updateAccount(account);
		subjectAccountServiceImp.notifyObserversChanging();
	
	}

	@Override
	public void  transferFunds(Account oldAccount, Account newAccount, double amount) {
		subjectAccountServiceImp.notifyObserversChanging();
		
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
