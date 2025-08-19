package model.application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = scanner.nextInt();
		
		System.out.print("Holder: ");
		scanner.next(); // Consumir a quebra de linha 
		String holder = scanner.nextLine();
		
		System.out.print("Initial balance: ");
		double balance = scanner.nextDouble();
		
		System.out.print("Withdraw limit: ");
		double withdraw = scanner.nextDouble();
		
		Account account = new Account(number, holder, balance, withdraw);		
		System.out.print("\nEnter amount for withdraw: ");
		double amount = scanner.nextDouble();
		account.withdraw(amount);
		System.out.printf("New balance: %.2f", account.getBalance());
		scanner.close();
	}
}
