package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	
	public void system() {
		Scanner scanner = new Scanner(System.in);
		int number01 = scanner.nextInt();
		int number02 = scanner.nextInt();
		int number03 = scanner.nextInt();
		int number04 = scanner.nextInt();
		System.out.printf("Diferença = %s", number01*number02-number03*number04);
	}
}
