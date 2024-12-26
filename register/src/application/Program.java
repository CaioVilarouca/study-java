package application;

import java.util.Scanner;

import entities.Product;

public class Program{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int amount, valueStock;
		double value;
		
		System.out.print("Value stock: ");
		valueStock = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Name product   :");
		name = scanner.nextLine();
		System.out.print("Amount product :x");
		amount = scanner.nextInt();
		System.out.print("Price product  :$");
		value = scanner.nextDouble();
		
		Product product = new Product(name, value);
	}
}
/*
	public class Program {
		public static void main (String[] args) {
			SystemRegister systemRegister = new SystemRegister();
			systemRegister.starRegister();
		}
	}
*/