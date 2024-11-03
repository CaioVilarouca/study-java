package application;

import java.util.InputMismatchException;
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
	}
}
