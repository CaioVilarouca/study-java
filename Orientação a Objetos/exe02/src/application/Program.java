package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	public void system() {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter product data:\nName: ");
		String name=scanner.next();
		System.out.print("Price: ");
		double price=scanner.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity=scanner.nextInt();
		
		Product product=new Product(name,price,quantity);
		System.out.println("Product data: "+product);
		
		System.out.print("Enter the number of products to be added in stock: ");
		quantity=0;
		quantity=scanner.nextInt();
		product.addProducts(quantity);
		System.out.println("Updated data "+product);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity=0;
		quantity=scanner.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated data "+product);
		scanner.close();
	}
}
