package frontend;

import java.util.Scanner;

import backend.Stock;

public class StarStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double avg = 0;
		
		System.out.print("Value stock: ");
		int number = scanner.nextInt();
		Stock[] stock = new Stock[number];
		
		for (int i = 0; i < stock.length; i++) {
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Price $");
			double price = scanner.nextDouble();
			
			stock[i] = new Stock(name, price);
			
		}
		for (Stock vect : stock) {
			avg += vect.getValue();
			System.out.println(vect.getName());
		}
		System.out.printf("Average : %.2f", avg/number);
		scanner.close();
	}
}
