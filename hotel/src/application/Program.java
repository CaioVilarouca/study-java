package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, room;
		String name;
		
		System.out.println("Quartos 0 a 99 disponível: ");
		System.out.print("Quantos vai add :");
		room = scanner.nextInt();
		
		Rent[] rent = new Rent[99];
		
		for (int i = 0; i < room; i++) {
			System.out.print("#0" + (i+1));
			scanner.nextLine();
			System.out.print("\nNome: ");
			name = scanner.nextLine();
			System.out.print("Número do quarto: ");
			number = scanner.nextInt();
			
			rent[number - 1] = new Rent(name, number); 
		}
		
		System.out.println("\nQuartos oculpados: ");
		for (Rent x : rent) {
			if (x != null) {
				System.out.println(x);
			}
		}
		scanner.close();
	}
}
