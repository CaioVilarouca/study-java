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
		double number = scanner.nextDouble();
		System.out.printf("A= %.2f", Math.PI * number * number);
		scanner.close();
	}
}
