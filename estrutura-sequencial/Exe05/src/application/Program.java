package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	
	public void system() {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		double value = scanner.nextDouble();	
		int amount2 = scanner.nextInt();
		double value2 = scanner.nextDouble();
		System.out.printf("VALOR A PAGAR R$%.2f", (amount*value)+(amount2*value2));
		scanner.close();
	}
}
