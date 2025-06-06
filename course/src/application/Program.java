package application;

import java.util.Date;

import entites.Order;
import entities.enums.OrderStatus;

public class Program {
	public static void main (String[] args) {
		new Program().exe();
	}
	public void exe() {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
	}
}
