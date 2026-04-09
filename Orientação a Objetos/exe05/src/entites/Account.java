package entites;

public class Account {
	private Integer number;
	private String name;
	private Double money;
	
	public Account(Integer number, String name, Double money) {
		this.number = number;
		this.name = name;
		this.money = money;
	}

	public Account(Integer number, String name) {
		this.number = number;
		this.name = name;
		this.money=0.0;
	}
	
	public double depostiValue(double amount) {
		return money+=amount;
	}
	
	public double withdrawValue(double amount) {
		money -= 5.00;
		return money-=amount;
	}

	@Override
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f",number,name,money);
	}
}
