package teste;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		new Teste().method2(scanner);
		scanner.close();

	}
	
	public void method2(Scanner scanner) {
		
		String[] vect = scanner.nextLine().split(" "); // Add dados no vector na mesma linha usando espaço
		
		int position = scanner.nextInt();
		
		try {
			System.out.printf("Position %d value: %s", position, vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) { // Quanto tenta acessar uma posição que não existe  
			System.out.println("Valor INVALIDO!");
			
		} catch (InputMismatchException e) { // Quanto valor digitado não é do tipo INT
			System.out.println("Esse campo e aceito apenas numeros.");
		} finally {
			int cont = 0;
			
			for (int i = 0; i < vect.length; i++) {
				cont++;
			}
			System.out.println("\nVect tem " + cont);
		}
	}
}
