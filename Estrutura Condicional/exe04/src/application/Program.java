package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner=new Scanner(System.in);
		double x=scanner.nextInt();
		x = x<100 ?50.0:(50.0+(x-100)*2.0);
		System.out.printf("Valor a pagar: R$ %.2f",x);
		scanner.close();
	}
}
