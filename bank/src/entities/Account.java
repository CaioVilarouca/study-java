package entities;

public class Account {
	protected Integer  number;
	protected String holder;
	protected Double balance;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void  withDraw(Double amount) {
		balance -= amount;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
}
