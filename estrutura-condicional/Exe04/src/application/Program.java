package application;

import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int fish = scanner.nextInt();
		int horus;
		if (start < fish)
			horus=start-fish;
		else
			horus=(24-start)+fish;
		System.out.print("O jogo durou "+horus+" Horas");
		scanner.close();
	}
}
