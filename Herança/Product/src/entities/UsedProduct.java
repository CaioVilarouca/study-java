package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product {
	private LocalDate manufacture;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}
	
	@Override
	public final String priceTag() {
		return getName()+ " (used) "+ String.format("%.2f", getPrice()) +" (Data de fabricação: " + manufacture.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
	}
}
