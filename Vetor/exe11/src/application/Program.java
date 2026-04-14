package application;

import java.util.Locale;
import java.util.Scanner;

import entiites.Form;

public class Program {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int number =scanner.nextInt();
		Form[] form = new Form[number];
		for (int i=0;i<form.length;i++) {
			System.out.print("Altura da "+(i+1) +":");
			double height = scanner.nextDouble();
			System.out.print("SEXO da "+(i+1) +":");
			char sexy = scanner.next().charAt(0);
			form[i] = new Form(height, sexy);
		}
        double smaller = form[0].getHeight();
        double bigger = form[0].getHeight();		
        int sumF=0, heightH=0;
		double heightF=0.0;
		for(Form x:form) {
			if (x.getHeight()>bigger)
				bigger=x.getHeight();
			
			if (x.getHeight()<smaller)
				smaller=x.getHeight();
			
			if (x.getSexy() == 'f') {
				sumF++;
				heightF += x.getHeight();
			}else 
				heightH++;
		}
		System.out.println("Menor altura " + smaller);
		System.out.println("Maior altura " + bigger);
		System.out.printf("Media das alturas das mulheres = %.2f\n", heightF/sumF);
		System.out.println("Número de homens = "+ heightH);

		scanner.close();
	}
}
