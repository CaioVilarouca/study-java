package entites;

public class Hub {
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public double getValueTotal(int amount, double value) {
		return amount * value;
	}

	@Override
	public String toString() {
		return "Hub [amount=" + amount + "]";
	}
	
}
