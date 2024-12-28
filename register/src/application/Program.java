package application;

import java.util.Scanner;

import entities.HubStock;
import entities.Product;
import entities.Stock;

public class Program{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int amount, valueStock;
		double value;
		
		System.out.print("Value stock: ");
		valueStock = scanner.nextInt();
		
		Stock[] stock = new Stock[valueStock];
		
		for(int i = 0; i < valueStock; i++){
			scanner.nextLine();
			System.out.println("");
			System.out.print("Name product   :");
			name = scanner.nextLine();
			System.out.print("Amount product :x");
			amount = scanner.nextInt();
			System.out.print("Price product  :$");
			value = scanner.nextDouble();
			
			Product product = new Product(name, value);
			HubStock hubStock = new HubStock(amount);
			stock[i] = new Stock(product, hubStock);
		}
		
		System.out.println();
		for (Stock print : stock) {
			System.out.println(print);
		}
		
		scanner.close();
	}
}// tratar os erros; calcular o estoque; print na tela;