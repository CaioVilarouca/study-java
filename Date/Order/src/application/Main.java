package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String name = scanner.nextLine();
		System.out.print("E-Mail: ");
		String email = scanner.next();
		System.out.print("Data nasc (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println("Insira os dados do pedido:");
		System.out.print("Status: ");
		String status = scanner.next();
		
		System.out.print("Quantos itens há neste pedido? ");
		int amount = scanner.nextInt();
		
		Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), new Client(name, email, birthDate));
		for (int i= 1; i<=amount;i++) {
			System.out.println("Pedido #"+i+" item:");
			System.out.print("Nome do produto: ");
			String nameProduct  = scanner.next();
			System.out.print("Preço do produto R$");
			double priceProduct = scanner.nextDouble();
			System.out.print("Quantidade: ");
			int amountProduct = scanner.nextInt();
			
			OrderItem orderItem = new OrderItem(amountProduct, new Product(nameProduct, priceProduct));
			order.addItem(orderItem);
		}
		
		System.out.println("NOTA");
		System.out.print("Hora: " + order.getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		System.out.print("\nStatus:" + OrderStatus.ENTREGUE);
		System.out.print("\nNome: "+ order.getClient().getName()+" "+ order.getClient().getBirthDate()+" - "+order.getClient().getEmail());
		System.out.println("\nITEMS");
		order.print();
		System.out.printf("\nTotal R$%.2f", order.total());
		scanner.close();
	}

}
