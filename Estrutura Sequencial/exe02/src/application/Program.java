package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Entrada:");
		try {
			a=scanner.nextInt();
			b=scanner.nextInt();
			c=scanner.nextInt();
			d=scanner.nextInt();
			System.out.println("DIFERENCA: "+ ((a*b)-(c*d)));
		}catch(InputMismatchException e) {
			System.out.println("ERRO, "+e);
		}
		scanner.close();
	}
}
