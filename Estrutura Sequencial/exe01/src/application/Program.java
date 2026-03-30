package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int x,y;
		System.out.println("Entrada: ");
		try {
			x=scanner.nextInt();
			y=scanner.nextInt();
			System.out.println("SOMA = "+(x+y));
		} catch (InputMismatchException e) {
			System.out.println("Erro na entrada de dados. "+e);
		}
		scanner.close();
	}
}
