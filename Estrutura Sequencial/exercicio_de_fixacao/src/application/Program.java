package application;

import java.util.Locale;

public class Program {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		String product01="Computer",product02="Office desk";
		int age=30,code=5290;
		char gender='\u0046'; // Tabela UNICODE
		double price01=2100.0,price02=650.50;
		System.out.printf("Products\n%s, which price is $ %.2f\n%s, which price is $ %.2f",product01,price01,product02,price02);
		System.out.printf("\nRecord: %d years old, code %d and %s",age,code,gender);
	}
}
