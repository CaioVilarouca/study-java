package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner=new Scanner(System.in);
		try {
			int time, id;
			double salary;
			System.out.println("Entrada:");
			id=scanner.nextInt();
			time=scanner.nextInt();
			salary=scanner.nextDouble();
			System.out.printf("Number = %d\nSalary = U$ %.2f",id,(time*salary));
		}catch (InputMismatchException e) {
			System.out.println("ERRO "+e);
		}
		scanner.close();
	}
}
