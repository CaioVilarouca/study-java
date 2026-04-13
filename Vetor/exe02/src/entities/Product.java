package entities;

public class Product {
	private String name;
	private Double price;
	
	public Product(String name, double price) {
		this.name=name;
		this.price=price;
	}

	public Double getPrice() {
		return price;
	}
}
