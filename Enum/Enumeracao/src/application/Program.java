package application;

import java.util.Date;

public class Program {
	public static void main(String[] args) {
		Order order = new Order(2343, new Date(), OrderStatus.PAGAMENTO_PENDENTE);
		Order order2 = new Order(43, new Date(), OrderStatus.valueOf("ENTREGUE"));
		
		OrderStatus o1 = OrderStatus.PROCESSANDO;

		System.out.println(order.toString());
		System.out.println(o1);

		System.out.println(order2.toString());

	}
}
