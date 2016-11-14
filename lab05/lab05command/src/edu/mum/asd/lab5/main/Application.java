package edu.mum.asd.lab5.main;



import edu.mum.asd.lab5.entity.*;
import edu.mum.asd.lab5.service.*;




public class Application {

	public static void main(String[] args) {
		
		CheckingAccount checkingAccount = new CheckingAccount();
		checkingAccount.setAccountNumber("AA-1234");

		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.setAccountNumber("BB-1234");

		AccountService accountService = new AccountServiceImpl();
		accountService.createAccount(savingsAccount);
		accountService.createAccount(checkingAccount);
		accountService.deposit(checkingAccount, 100.0);
		accountService.undoLastTransaction(checkingAccount);;
		accountService.redoLastTransaction(checkingAccount);;
		accountService.deposit(savingsAccount, 1000.0);

		
		
	}

}
