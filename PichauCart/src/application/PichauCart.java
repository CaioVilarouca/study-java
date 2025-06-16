package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		// Coletando os dados pessoais
		dateClient(scanner);
		
		scanner.close();
	}
	
	public void dateClient(Scanner scanner) {
		System.out.println("Entre com os dados: ");
		System.out.print("Nome: ");
		String name = scanner.nextLine();
		
		System.out.print("E-mail: ");
		String e_mail = scanner.next();
		
		System.out.print("Data de nasc: (dd/MM/yyyy) ");
		String nascString = scanner.next();
		
		// Convertendo string para obj Date 
		conversion(name, e_mail, nascString, scanner);
	}
	
	public void conversion(String nameClient, String emailClient, String nascClient, Scanner scanner) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date dateNasc = format.parse(nascClient);
			Date dateNow = new Date();
			
			Client client = new Client(nameClient, emailClient, dateNasc);
			
			Order order = new Order(dateNow, OrderStatus.PROCESSANDO);
			System.out.println("Status: " + OrderStatus.PROCESSANDO);
			
			// Lista de produtos
			listProduct(client, order, scanner);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}	
	}
	
	public void listProduct(Client client, Order order, Scanner scanner) {
		System.out.print("Quantos items ? ");
		int valueUnid = scanner.nextInt();
		
		double total = 0;
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
			// Armazenado em um list ArrayList
			order.addProduct(product);
			
			total += orderCart.subTotal();
		}
		// Print do resultado
		result(client, order, total);
	}
	
	public void result(Client client, Order order, Double total){
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
		System.out.println("Total das compras R$" + total);
		System.out.println(OrderStatus.ENTREGUE);
	}
}