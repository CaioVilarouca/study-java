package application;

import java.util.Scanner;
import entities.Product;

public class UI {
	Scanner scanner = new Scanner(System.in);
	Product product = new Product();
	
	public void systemRM(){
		System.out.println("Cadastro de produtos");
		register();
		
	}
	
	public void register() {
		boolean whileTest = true;
		
		while(whileTest){
			try {
				System.out.println("\nPreencher os dados a seguir: \n");
				
				System.out.print("Nome do produto: ");
				product.setName(scanner.nextLine());
				System.out.print("Valor do produto: R$");
				product.setValue(scanner.nextDouble());
				
				whileTest = false;
			} catch (Exception e) {
				whileTest = true ;
				System.out.println("\nDados invalidos:\nDigite novamente!\n\n");
				scanner.nextLine();
			}
		}
		System.out.println("Saiu do loop");
	}
}