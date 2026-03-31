package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);;
		int x=scanner.nextInt();
		if(x>=0)
			System.out.println("POSITIVO");
		else 
			System.out.println("NEGATIVO");
		scanner.close();
	}
}
