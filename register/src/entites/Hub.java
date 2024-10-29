package entites;

public class Hub {
	private int amount;
	private double amountEnd;
	private Product product;
	
	
	
	public Hub() {
		super();
	}

	public Hub(int amount, Product product) {
		super();
		this.amount = amount;
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	public void getValueTotal() {
		amountEnd = amount * product.getValue();
	}

	
}
