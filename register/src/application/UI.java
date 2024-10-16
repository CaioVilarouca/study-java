package application;

import java.util.Scanner;
import entites.Product;

public class UI {
	Scanner scanner = new Scanner(System.in);
	Product product = new Product();
	
	public void system() {
		System.out.println("Registro de produtos");
		register();
		
	}
	
	public void register() {
		boolean whileTest = true;
		while(whileTest) {
			try {
				System.out.println("\n\n\nNovo registro:");
				System.out.println("Nome do produto :");
				product.setName(scanner.nextLine());
				System.out.println("Valor do produto R$:");
				
				whileTest = false;
				product.setValue(scanner.nextDouble());
			} catch (Exception e) {
				System.out.println("Digite novamente.\nDados incorreto!");
				whileTest = true;
				scanner.nextLine();
			}
			
		}
		System.out.println("Saiu do loop");
	}
}
