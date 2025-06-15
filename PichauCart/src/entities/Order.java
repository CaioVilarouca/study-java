package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	private List<Product> product = new ArrayList<>();

	public Order(Date moment, OrderStatus status) {
		super();
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	public void addProduct(Product productADD) {
		product.add(productADD);
	}
	
	public void removeProduct(Product productADD) {
		product.remove(productADD);
	}
	
	public void printList() {
		for (Product x : product) {
			System.out.println(x);
		}
	}

	@Override
	public String toString() {
		return "Order [moment=" + moment + ", status=" + status;
	}
	
	
}
