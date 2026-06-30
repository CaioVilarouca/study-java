package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Informe o dados da conta:");
			System.out.print("Número: ");
			int number = scanner.nextInt();
			System.out.print("Nome: ");
			scanner.next();
			String holder = scanner.nextLine();
			System.out.print("Saldo: ");
			double balance = scanner.nextDouble();
			System.out.print("Limite de retirada: ");
			double withdrawLimit = scanner.nextDouble();
			Account account = new Account(number,holder,balance,withdrawLimit);
			System.out.print("\nInforme o valor a ser retirado: ");
			double withdraw = scanner.nextDouble();
			account.withdraw(withdraw);
			
		} catch (InputMismatchException e) {
			System.out.print("ERRO ao informa os dados da conta ");
		} catch (IllegalArgumentException e){
			System.out.println("Erro na retirada."+e.getMessage());
		}
		scanner.close();
	}
}
