package entities;

public class HubStock {
	private Product product;
	private Integer amount;
	
	public HubStock(Product product, Integer amount) {
		this.product = product;
		this.amount = amount;
	}

	private Double valueStock;
		
		public Integer getAmount() {
			return amount;
		}
	
		public void setAmount(Integer amount) {
			this.amount = amount;
		}
	
		public Double getValueStock() {
			return valueStock;
		}
	
		// Calculando o valor do estoque
		public double getValueStock (double value, int amount) {
			return valueStock = value * amount;
		}
}
