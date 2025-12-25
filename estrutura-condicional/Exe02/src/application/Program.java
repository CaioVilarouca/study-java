package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	public void system() {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number%2==0)
			System.out.println("PAR");
		else 
			System.out.println("IMPAR");
		scanner.close();
	}
}
