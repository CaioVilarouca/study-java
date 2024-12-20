package application;

import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos números vai digitar?");
		int number = scanner.nextInt();
		scanner.close();
	}
}
