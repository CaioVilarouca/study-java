package entites;

public class Hub {
	private Product product;
	private int amount;
	
	// Caixa rápido de dez volume
	public void registerStock() {
		for (int i = 0; i > 10; i++) {
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
