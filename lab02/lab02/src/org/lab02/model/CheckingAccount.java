package org.lab02.model;



public class CheckingAccount extends Account {

	public CheckingAccount(){
		setInterest(new CheckingAccountInterest());
	}

	

}
