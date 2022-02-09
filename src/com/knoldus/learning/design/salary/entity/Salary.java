package com.knoldus.learning.design.salary.entity;

import com.knoldus.learning.design.salary.type.CurrencyType;

public class Salary {

	private CurrencyType currency;
	private double amount;
	
	public Salary(CurrencyType currency, double amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	public CurrencyType getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyType currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Salary{" +
				"currency=" + currency +
				", amount=" + amount +
				'}';
	}
}
