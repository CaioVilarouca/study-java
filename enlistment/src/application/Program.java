package application;

import java.util.Scanner;
import entities.People;

public class Program {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			People people = new People();
			
			System.out.println("Alistamento Militar");
			System.out.print("Digite seu nome: ");
			people.setName(scanner.nextLine());
			System.out.print("Digite sua ano de nasc: ");
			people.setYear(scanner.nextInt());
			
			scanner.close();
		}
}
