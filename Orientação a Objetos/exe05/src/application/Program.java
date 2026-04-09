package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter account number: ");
		int number=scanner.nextInt();
		System.out.print("Enter account holder: ");
		scanner.nextLine();
		String name=scanner.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char option=scanner.next().charAt(0);
		
		Account account;
		if(option == 'y') {
			System.out.print("Enter inital deposit value: ");
			double money = scanner.nextDouble();
			account = new Account(number, name, money);
		}else {
			account = new Account(number, name);
		}

		System.out.println("\n"+account+"\n");
		System.out.print("Enter a deposit value: ");
		double deposit = scanner.nextDouble();
		account.depostiValue(deposit);
		System.out.println("\n"+account+"\n");
		
		System.out.print("Enter a withdraw value: ");
		deposit=0;
		deposit = scanner.nextDouble();
		account.withdrawValue(deposit);
		System.out.println("\n"+account+"\n");
		scanner.close();
	}
}
