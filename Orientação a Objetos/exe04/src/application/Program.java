package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double price=scanner.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double bought=scanner.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.amount(price,bought));
		scanner.close();
	}
}
