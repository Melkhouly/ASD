package org.lab02.Application;

import org.lab02.model.Account;
import org.lab02.model.CheckingAccount;
import org.lab02.model.Customer;
import org.lab02.model.Interest;
import org.lab02.model.SavingAccount;
import org.lab02.model.SavingAccountInterest;
import org.lab02.observer.EmailSender;
import org.lab02.observer.Logger;
import org.lab02.observer.SmsSender;
import org.lab02.service.AccountService;
import org.lab02.service.AccountServiceImpl;
import org.lab02.service.Subject;
import org.lab02.service.SubjectAccountServiceImp;

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
		
		
		AccountServiceImpl as = new AccountServiceImpl();
		
		Logger logger= new Logger(as.getSubjectAccountServiceImp());
		EmailSender emailSender= new EmailSender(as.getSubjectAccountServiceImp());
		SmsSender sms = new SmsSender(as.getSubjectAccountServiceImp());
		
		as.createAccount(sa1);
		//as.deposit(sa1, 2000);
			
		

		System.out.println("Account Name ==> "+sa1.getAccountNumber()+" Account Balance "+sa1.getBalance()+"  interest  "+sa1.getInterest().calculateInterest(sa1));
		
		as.withDraw(sa1, 1500);
		//System.out.println("Account Details ==> "+ sa1);

	}

}
