package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.HubStock;
import entities.Product;

public class SystemRegister {
	Scanner scanner = new Scanner(System.in);
	Product product = new Product();
	HubStock hubStock = new HubStock();
	
	public void starRegister() {
		for (int i = 0; i < 3; i++) {
			System.out.println("\nNovo registro de produto.\n");
			newRegister();
			register();
			scanner.nextLine();// Consome qualquer linha remanascente
			printStock();
		}
	}
	
	public void newRegister() {
        System.out.print("Nome: ");
        product.setNameProduct(scanner.nextLine());
		
        while (true) {
            try {
                System.out.print("Valor R$ ");
                product.setValueProduct(scanner.nextDouble());
                if (product.getValueProduct() <= 0) {
                    throw new IllegalArgumentException("O valor não pode ser negativo ou null.");
                }
                break; // Sair do loop se a entrada for válida
                
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico.");
                scanner.next();
                
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } 
        }
        
        while (true) {
        	try {
				System.out.print("Quantidade x");
				hubStock.setAmount(scanner.nextInt());
				if (hubStock.getAmount() <= 0) {
					throw new IllegalArgumentException("A quantidade não pode ser negativo ou 0");
				}
				break;
				
			} catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico.");
                scanner.next();
                
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } 
        }
        hubStock.getValueStock(product.getValueProduct(), hubStock.getAmount());
	}
	
	public void register() {
		System.out.println("\nNovo registro inserido\n");
		System.out.printf("Nome: [%s] | Preço de custo: [R$%.2f] \nQuantidade em estoque: [x%d]\nValor d1o estoque: [R$%.2f]", product.getNameProduct(), product.getValueProduct(), hubStock.getAmount(), hubStock.getValueStock());
	}
	
	public void printStock() {
	}
}
