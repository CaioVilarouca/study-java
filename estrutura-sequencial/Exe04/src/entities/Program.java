package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		new Program().system();
	}

	public void system() {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		double value = scanner.nextDouble();
		// Hardcore
		System.out.println("Número: "+number);
		System.out.println("Salário: R$"+ (value*5.50));
		scanner.close();
	}
}
