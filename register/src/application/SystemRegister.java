package application;

import java.util.Scanner;

import entities.Product;

public class SystemRegister {
	Scanner scanner = new Scanner(System.in);
	Product product = new Product();
	
	public void star() {
		System.out.println("Novo registro de produto.\n");
		newRegister();
	}
	
	public void newRegister() {
		System.out.print("Nome: ");
		product.setNameProduct(scanner.nextLine());
		
		System.out.print("Valor R$ ");
		product.setValueProduct(scanner.nextDouble());
		
		System.out.print("Quantidade: x");	
		
		scanner.close();
	}
}
