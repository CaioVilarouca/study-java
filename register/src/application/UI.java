package application;

import java.util.Scanner;

import entites.Product;

public class UI {
	Scanner scanner = new Scanner(System.in);
	Product product = new Product();
	
	public void system() {
		star();
		register();		
	}
	
	public void star() {
		System.out.println("Registro de estoque HUB");
	}
	
	public void register() {
		boolean whileTest = true;
		while(whileTest) {
			try {
				System.out.println("\n\n\nNovo registro:");
				System.out.print("Nome do produto :");
				product.setName(scanner.nextLine());
				System.out.print("Valor de custo do produto R$:");
				product.setValue(scanner.nextDouble());
				System.out.print("Quantidade do produto :");
				
				whileTest = false;
			} catch (Exception e) {
				System.out.print("Digite novamente.\nDados incorreto!");
				whileTest = true;
				scanner.nextLine();
			}
			
		}
	}
}
