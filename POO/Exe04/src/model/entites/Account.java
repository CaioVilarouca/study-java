package model.entites;

public class Account {
	private Integer number;
	private String Holder;
	private Double balance;
	private Double Withdraw;
	
	public Account(Integer number, String holder, Double balance, Double withdraw) {
		this.number = number;
		this.Holder = holder;
		this.balance = balance;
		this.Withdraw = withdraw;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		Holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdraw() {
		return Withdraw;
	}

	public void setWithdraw(Double withdraw) {
		Withdraw = withdraw;
	}
	
	
}
