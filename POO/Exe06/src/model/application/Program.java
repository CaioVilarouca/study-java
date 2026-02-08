package model.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		new Program().system();
	}
	public void system() {
		Scanner scanner = new Scanner(System.in);
		sizeMatrix(scanner); 
		scanner.close();
	}
	
	public void sizeMatrix(Scanner scanner) {
		System.out.print("Informe o tamanho da matriz: ");
		try {
			int row = scanner.nextInt();
			int column = scanner.nextInt();
			Matrix matrix = new Matrix(row, column);
			matrix.printMatrix();
			matrix.updateMatrix(scanner);
			matrix.printMatrix();
			
			System.out.print("Buscar :");
			int numberSearch = scanner.nextInt();
			matrix.search(numberSearch);
		} catch (InputMismatchException e ) {
			System.out.println("Erro de entrada da varável. ");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro de entrada da varável. " +e.getLocalizedMessage());

		}
	}
}
