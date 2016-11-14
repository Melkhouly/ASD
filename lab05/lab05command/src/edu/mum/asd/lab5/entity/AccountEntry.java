package edu.mum.asd.lab5.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AccountEntry {

	
	private Date date;
	private String description;
	private String fromAccountNumber;
	private String fromPersonName;
	private BigDecimal amount;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFromAccountNumber() {
		return fromAccountNumber;
	}

	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}

	public String getFromPersonName() {
		return fromPersonName;
	}

	public void setFromPersonName(String fromPersonName) {
		this.fromPersonName = fromPersonName;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "AccountEntry [date=" + date + ", description=" + description + ", fromAccountNumber="
				+ fromAccountNumber + ", fromPersonName=" + fromPersonName + ", amount=" + amount + "]";
	}
	
	
}
