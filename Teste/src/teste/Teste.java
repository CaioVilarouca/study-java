package teste;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] vect = scanner.nextLine().split(" ");
		
		int position = scanner.nextInt();
		
		try {
			System.out.printf("Position %d value: %s", position, vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Valor INVALIDO!");
			
		} catch (InputMismatchException e) {
			System.out.println("Esse campo e aceito apenas numeros.");
		} finally {
			int cont = 0;
			
			for (String x : vect) {
				cont++;
			}
			
			System.out.println("\nVect tem " + cont);
		}
		scanner.close();
	}
}
