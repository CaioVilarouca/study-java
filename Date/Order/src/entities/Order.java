package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import enums.OrderStatus;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	private List <OrderItem> orderItem = new ArrayList<>();
	
	public Order() {}
	
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	
	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public void addItem(OrderItem item) {
		orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}
	
	public double total() {
		int sum = 0;
		for (OrderItem item : orderItem) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	public void print() {
		for (OrderItem item : orderItem) {
			System.out.printf("%s, R$%.2f, quantidade: %d, subTotal: %.2f \n", item.getProduct().getName(), item.getProduct().getPrice(), item.getQuantity(), item.subTotal());
		}
	}
}
