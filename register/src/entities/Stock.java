package entities;

public class Stock {
	private Product product;
	private HubStock hubStock;
	
	public Stock(Product product, HubStock hubStock) {
		this.product = product;
		this.hubStock = hubStock;
	}

	@Override
	public String toString() {
		return "Stock [product=" + product + ", hubStock=" + hubStock + "]";
	}
}