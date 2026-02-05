package model.services;

import model.entites.Account;

public class TransitionMoney {
	private Account account;
	
	
	
	public TransitionMoney(Account account) {
		super();
		this.account = account;
	}



	public double Withdraw(double amount) {
		
		if(amount > account.getWithdraw()) {
			throw new IllegalArgumentException("O quantidade a ser sacada excede o limite da conta.");
		}
		
		if(amount > account.getBalance()) {
			throw new IllegalArgumentException("Saldo insuficiente.");
		}
		
		double update = account.getBalance() - amount;
		account.setBalance(update);
		return update;
	}
	
}
