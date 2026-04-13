package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar :");
		int number = scanner.nextInt();
		double[] vect = new double[number];
		for (int i=0;i<vect.length;i++) {
			System.out.print("Informe um número: ");
			double value =scanner.nextDouble();
			vect[i]=value;
		}
		double sum=0; 
		System.out.print("Valores: ");
		for (double x : vect) {
			System.out.print(" "+x);
			sum += x;
		}
		System.out.println("\nSOMA :" + sum);
		System.out.printf("MEDIA : %.2f", sum/number);
		scanner.close();
	}
}
