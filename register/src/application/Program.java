package application;

import java.util.Scanner;

import entities.HubStock;
import entities.Product;
import entities.Stock;

public class Program{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int amount,valueSize;
		double value, valueStock = 0;
		
		System.out.print("Size stock: ");
		valueSize = scanner.nextInt();
		
		Stock[] stock = new Stock[valueSize];
		
		for(int i = 0; i < valueSize; i++){
			scanner.nextLine();
			System.out.println("");
			System.out.print("Name product   :");
			name = scanner.nextLine();
			System.out.print("Amount product :x");
			amount = scanner.nextInt();
			System.out.print("Price product  :$");
			value = scanner.nextDouble();
			
			Product product = new Product(name, value);
			HubStock hubStock = new HubStock(amount, product);
			valueStock += hubStock.sum();
			stock[i] = new Stock(product, hubStock);
		}
		
		System.out.println();
		for (Stock print : stock) {
			System.out.println(print);
		}
		System.out.printf("Value Stock R$%.2f", valueStock);
		
		scanner.close();
	}
}// tratar os erros; calcular o estoque; print na tela;