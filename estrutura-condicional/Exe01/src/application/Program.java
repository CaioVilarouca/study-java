package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number > 0)
			System.out.println("POSITIVO");
		else if (number < 0)
			System.out.println("NEGATIVO");
		else
			System.out.println("SEM VALOR");
		scanner.close();
	}
}
