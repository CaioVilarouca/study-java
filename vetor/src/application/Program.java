package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number[] = new int[3];	
		for (int i = 0; i < 3; i++) {
			System.out.print(" :");
			number[i] = scanner.nextInt();
		}
		
		for (int i : number) {
			System.out.println("Número digitado: " + i);
		}
		scanner.close();
	}
}
