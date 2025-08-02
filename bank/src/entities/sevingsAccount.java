package entities;

public class sevingsAccount extends Account{
	protected Double interestRate;

	public sevingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
			balance += balance * interestRate;
	}
}
