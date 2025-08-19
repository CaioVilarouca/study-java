package model.entities;

import model.exception.DominException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
		super();
	}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	
	// Depositar na conta
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	// Sacar na conta
	public void withdraw(Double amount) {
		if (amount > withDrawLimit) {
			throw new DominException("The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new DominException("Not enougbh balance");
		}
		this.balance -= amount;
	}
}
