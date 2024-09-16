package application;


import java.util.Scanner;

import entities.LibraryMath;

public class ProgramMath {
	public static void main (String[] args) {
		// Import Object 
		Scanner scanner = new Scanner(System.in);
		double number01, number02, number03, number04;
		
		System.out.print("========MENU=======\n"
				+ "[1] Para soma dois números\n"
				+ "[2] Para calcular dois raio\n"
				+ "[3] Para soma quatro valores e mostra diferença\n"
				+ "Digite: ");
		
		try {
			int condition = scanner.nextInt();
			switch (condition) {
			case 1:
				// Sum of two number
				try {	
					System.out.println("========== Soma de dois números =========");
					System.out.print("Digite um número: ");
					number01 = scanner.nextDouble();
					System.out.print("Digite mais um número: ");
					number02 = scanner.nextDouble();
					LibraryMath libraryMathSum = new LibraryMath(number01, number02);
					System.out.printf("A somda de %.2f + %.2f = %.2f", libraryMathSum.caractere01 , libraryMathSum.caractere02, libraryMathSum.mathSum());
				}catch (Exception e) {
					System.out.println("Erro de digitação");
				} 
				break;
			case 2:
				System.out.println("===== Soma de dois raio de circulo =====");
				System.out.print("Digite um número : ");
				number01 = scanner.nextDouble();
				LibraryMath libraryMathRay = new LibraryMath(number01);
				System.out.printf("\nRaio do circulo %f = %.4f", libraryMathRay.caractere01, libraryMathRay.mathRay());
			case 3:
				System.out.println("=== Soma de quatro valores e mostra a diferença");
				System.out.print("Digite o primeiro número: ");
				number01 = scanner.nextDouble();
				System.out.print("Digite o segundo número: ");
				number02 = scanner.nextDouble();
				System.out.print("Digite o terceiro número :");
				number03 = scanner.nextDouble();
				System.out.print("Digite o quarto número: ");
				number04 = scanner.nextDouble();
				LibraryMath libraryMathFour = new LibraryMath(number01, number02, number03, number04);
				System.out.printf("\nA Diferença dos quatro valores %.2f", libraryMathFour.MathFour());
				break;
			default:
				System.out.println("\nPrograma ecerrado: " + condition);
				break;
			}
		}catch (Exception e) {
			System.out.println("Erro de digitação");
		}
		scanner.close();
		// Caio Vilarouca
	}
}
