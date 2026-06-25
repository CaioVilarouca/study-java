package entities;

public final class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return getPrice()+customsFee;
	}

	@Override
	public final String priceTag() {
		return getName() +" $"+ String.format("%.2f", totalPrice()) +" (Custo do importe: " + String.format("%.2f)", customsFee);
	}
}
