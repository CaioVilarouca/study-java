package application;

import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Quantos números vai digitar ?");
		int number = scanner.nextInt();
		int value[] = new int[number];
		
		for (int i = 0; i < number; i++) {
			value[i] = scanner.nextInt();
		}
		
		for (int x : value) {
			System.out.println("Número negativos digitados: ");
			if (x < 0) {
				System.out.println(x);
			}
		}
		scanner.close();
	}
}
