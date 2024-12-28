package entities;

public class HubStock {
	private int amount;
	private Product product;
	
	public HubStock(int amount, Product product) {
		this.amount = amount;
		this.product = product;
	}

	public double sum() {
		return product.getValueProduct() * amount;
	}
	
	@Override
	public String toString() {
		return " " + amount;
	}	
}
