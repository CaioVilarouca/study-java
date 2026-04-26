package application;

import java.util.Scanner;

import entites.Hotel;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Hotel[] vector = new Hotel[10];
		
		System.out.print("How many rooms will be rented? ");
		int number = scanner.nextInt();
		
		for(int i=0; i<number; i++) {
			System.out.println("\nRent #"+(i+1));
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("E-Mail: ");
			String email = scanner.next();
			System.out.print("Room: ");
			int numberRoom = scanner.nextInt();
				
			vector[numberRoom] = new Hotel(name,email,numberRoom);
		}
		
		System.out.println("Busy rooms:");
		for (Hotel hotel : vector) {
			if (hotel != null)
				System.out.println(hotel);
		}
		scanner.close();
	}
}
