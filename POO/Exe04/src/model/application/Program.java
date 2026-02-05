package model.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entites.Account;
import model.services.TransitionMoney;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner=new Scanner(System.in);

		try {
			System.out.println("Entre dados da conta: ");
			System.out.print("Número: ");
			int number = scanner.nextInt();
			System.out.print("Titular: ");
			scanner.next();
			String holder = scanner.nextLine();
			System.out.print("Saldo da conta: R$");
			double balance = scanner.nextDouble();
			System.out.print("Limite de saque: R$");
			double withdraw = scanner.nextDouble();
			
			Account account = new Account(number, holder, balance, withdraw);
			TransitionMoney transitionMoney = new TransitionMoney(account);
			
			System.out.print("Sacar R$");
			double amount = scanner.nextDouble();
			transitionMoney.Withdraw(amount);
			
			System.out.printf("Saldo da conta R$%.2f", account.getBalance());
			
		} catch (InputMismatchException e) {
			System.out.println("ERRO! Input data.");
		} catch (IllegalArgumentException e) {
			System.out.println("Saque: " + e.getMessage());
		}
		scanner.close();
	}
}
