package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		
		Product[] vect=new Product[number];
		
		for(int i=0;i<vect.length;i++) {
			String name=scanner.next();
			double price=scanner.nextDouble();
			vect[i] = new Product(name,price);
			
			
		}
		
		double sum=0.0;
		for (Product x: vect) {
			sum+=x.getPrice();
		}
		
		System.out.printf("AVERAGE PRICE = %.2f", sum/number);
		scanner.close();
	}
}
