package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import enities.enums.OrderStatus;
import entities.Client;
import entities.Order;


public class PichauCart {
	public static void main (String[] args) {
		new  PichauCart().exe();
	}
	public void exe() {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Entre com os dados: ");
		dateBase(scanner);
	}
	
	public void dateBase(Scanner scanner) { // Coleta de dados do cliente
		System.out.print("Nome: ");
		String name = scanner.nextLine();
		
		System.out.print("E-mail: ");
		String e_mail = scanner.next();
		
		System.out.print("Data de nasc: ");
		String dateString = scanner.next();
		
		// Conversor
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = format.parse(dateString);
			
			Client client = new Client(name, e_mail, date);
			System.out.println(client);
		} catch (ParseException e) {
			e.printStackTrace();
		}	
	}
	
	
}
