package model.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Triangle;
import model.service.Validation;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	public void system() {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe os valores dos triangulos.");
		Triangle X=null,Y=null;
		try {
			for (int i=0;i<2;i++) {
				if(i==0)
					System.out.println("Triangulo X\n");
				else
					System.out.println("\nTriangulo Y\n");
				System.out.print("Posição 01: ");
				double x=scanner.nextDouble();
				System.out.print("Posição 02: ");
				double y=scanner.nextDouble();
				System.out.print("Posição 03: ");
				double z=scanner.nextDouble();
				if (i==0)
					X = new Triangle(x,y,z);
				else
					Y = new Triangle(x,y,z);
			}
			Validation validation = new Validation();
			System.out.printf("Triangle X area: %.4f \n", validation.verification(X));
			System.out.printf("Triangle Y area: %.4f \n", validation.verification(Y));
			validation.area(validation.verification(X), validation.verification(Y));
		} catch (InputMismatchException e) {
			System.out.println("ERRO de input na variável!");
		}finally {
			scanner.close();
		}
	}
}
