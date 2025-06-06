package entities;

public class OrderCart {
	private Integer quantity;
	private Double price;
	
	public OrderCart() {
		}

	public OrderCart(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}
	
	public Double subTotal() {
		return quantity * price;
	}
}
