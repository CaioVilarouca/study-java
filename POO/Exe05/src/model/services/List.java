package model.services;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entites.Employee;
import model.entites.Registe;

public class List {
	public void system(){
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a quantidade de colaborador a ser add: ");
		Registe register = new Registe();
		try {
		int amount = scanner.nextInt();
			for(int i=0;i<amount;i++) {
				System.out.println("\nColaborador #"+(i+1));
				System.out.print("ID: ");
				int id = scanner.nextInt();
				System.out.print("Nome: ");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.print("Sálario: R$");
				double salary = scanner.nextDouble();
				
				Employee employee = new Employee(id,name,salary);
				register.addList(employee);
			}
			System.out.print("Buscar ID, colaborador: ");
			int steamID = scanner.nextInt();
			register.steam(steamID);
			System.out.print("Informe % ");
			@SuppressWarnings("unused")
			int percentage = scanner.nextInt();
			register.update(amount, steamID);
			
		} catch (InputMismatchException e) {
			System.out.println("ERRO entrada de input.");
		} catch (IllegalArgumentException e) {
			System.out.println("ERRO: " + e.getLocalizedMessage());
		}
		register.printList();
		scanner.close();
	}
}
