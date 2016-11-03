package org.lab01.Application;

import org.lab01.model.Account;
import org.lab01.model.CheckingAccount;
import org.lab01.model.Customer;
import org.lab01.model.Interest;
import org.lab01.model.SavingAccount;
import org.lab01.model.SavingAccountInterest;
import org.lab01.service.AccountService;
import org.lab01.service.AccountServiceImpl;

public class Main {
	
	public static void main(String[] arg) {
		
		Customer c1 = new Customer();
		c1.setName("Mahmoud Elkhouly");
		
		Account sa1 = new SavingAccount();
		sa1.setCustomer(c1);
		sa1.setAccountNumber("sa1001");
		sa1.setBalance(1000);
		
		//Interest interest= new SavingAccountInterest();
		//interest.calculateInterest(sa1);
		
		//sa1.setInterest(interest);
		
		
		AccountService as = new AccountServiceImpl();
		
		as.createAccount(sa1);
		//as.deposit(sa1, 2000);
	
		
		
		
		
		
		

		System.out.println("Account Name ==> "+sa1.getAccountNumber()+" Account Balance "+sa1.getBalance()+"  interest  "+sa1.getInterest().calculateInterest(sa1));
		
		as.withDraw(sa1, 1500);
		//System.out.println("Account Details ==> "+ sa1);

	}

}
