package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import enities.enums.OrderStatus;
import entities.Client;
import entities.Order;
import entities.OrderCart;
import entities.Product;


public class PichauCart {
	public static void main (String[] args) {
		new  PichauCart().exe();
	}
	public void exe() {
		// Coleta de dados do clinte para obj Client
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com os dados: ");
		System.out.print("Nome: ");
		String name = scanner.nextLine();
		
		System.out.print("E-mail: ");
		String e_mail = scanner.next();
		
		System.out.print("Data de nasc: (dd/MM/yyyy) ");
		String dateString = scanner.next();
		
		// Conversor
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = format.parse(dateString);
			Date dateNow = new Date();
			
			@SuppressWarnings("unused")
			Client client = new Client(name, e_mail, date);
			
			@SuppressWarnings("unused")
			Order order = new Order(dateNow, OrderStatus.PROCESSANDO);
			System.out.println("Status: " + OrderStatus.PROCESSANDO);
			
			System.out.print("Quantos items ? ");
			int valueUnid = scanner.nextInt();
			
			
			for (int i = 0; i < valueUnid; i++) {
				System.out.println("Produto de número  #" + (i + 1) + " item");
				System.out.print("Nome do produto: ");
				String nameProduct = scanner.next();
				System.out.print("Preço do produto: ");
				double priceProduct = scanner.nextDouble();
				System.out.print("Quantidade: ");
				int quantityProduct = scanner.nextInt();
				
				Product product = new Product(nameProduct, priceProduct);
				OrderCart orderCart = new OrderCart(quantityProduct, product.getPrice());
				order.addProduct(product);
			}
			System.out.println("\n");
			
	        SimpleDateFormat formatDateH = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

	        
	        String dateMomentString = formatDateH.format(order.getMoment());
	        System.out.println("Data " + dateMomentString + " Status:" + OrderStatus.ENVIADO);
	        
	        String dateNascString = formatDate.format(client.getNasc());
	        System.out.println("Cliente: " + client + " (" + dateNascString + ")");
	        
			System.out.println();
			System.out.println("Lista");
			order.printList();
		} catch (ParseException e) {
			e.printStackTrace();
		}	
		scanner.close();
	}
}
