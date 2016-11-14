package edu.mum.asd.lab5.service;

import java.math.BigDecimal;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import edu.mum.asd.lab5.dataaccess.AccountDAO;
import edu.mum.asd.lab5.entity.Account;

public class AccountServiceImpl implements AccountService {

	AccountDAO accountDAO;
	private Map<Account, Command> transactions = new Hashtable<>();
	
	
	@Override
	public void undoLastTransaction(Account account) {
		Command command = transactions.get(account);
		if(command == null){
			throw new IllegalStateException("Unsuported operation.");
		}
		command.undo();
	}

	@Override
	public void redoLastTransaction(Account account) {
		Command command = transactions.get(account);
		if(command == null){
			throw new IllegalStateException("Unsuported operation.");
		}
		command.execute();
	}

	
	
	@Override
	public void createAccount(Account a) {
		accountDAO.createAccount(a);
	}

	@Override
	public void deposit(Account account, double amount) {
		Command<Account, Double> depositCommand = new DepositCommand(account, amount);
		this.transactions.put(account, depositCommand);
		depositCommand.execute();	
		this.accountDAO.updateAccount(account);
		
	}

	@Override
	public void withdraw(Account account, double amount) {
		Command<Account, Double> withdrawCommand = new WithDrawCommand(account, amount);
		this.transactions.put(account, withdrawCommand);
		withdrawCommand.execute();

		this.accountDAO.updateAccount(account);
	
	}

	@Override
	public void transferFunds(Account source, Account target, double amount) {
		Command<Account, Double> transferFundsCommand = new TransferFundsCommand(source, target, amount);
		this.transactions.put(source, transferFundsCommand);
		transferFundsCommand.execute();
		target.deposit(BigDecimal.valueOf(amount));

	}

	@Override
	public List<Account> getAllAccounts() {
		return accountDAO.getAllAccounts();
	}

	@Override
	public Account getAccount(String accNo) {

		return accountDAO.getAccount(accNo);
	}


}
