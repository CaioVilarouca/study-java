package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		if (x>y) 
			System.out.printf("O JOGO DUROU %d HORAS(s)", y-(x-24));
		else if (x<y) 
			System.out.printf("O JOGO DUROU %d HORAS(s)", y-x);
		else 
			System.out.printf("O JOGO DUROU 24 HORAS(s)");
		scanner.close();
	}
}
