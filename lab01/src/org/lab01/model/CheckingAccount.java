package org.lab01.model;

public class CheckingAccount extends Account {

	public CheckingAccount(){
		setInterest(new CheckingAccountInterest());
	}

}
