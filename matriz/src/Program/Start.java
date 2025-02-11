package Program;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		new Start().start();
	}
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Número de linhas :");
		int line = scanner.nextInt();
		System.out.print("Número de colunas: ");
		int column = scanner.nextInt();
		
		System.out.print("Posição a buscar: ");
		byte position = scanner.nextByte();
		
		createMatriz(line, column, scanner, position);
		scanner.close();
	}
	
	public void createMatriz(int line, int column, Scanner scanner, Byte position) {
		int[][] matriz = new int[line][column];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		// Primeira posição
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == position) {
					System.out.println("A primeira aparição: " + i + " " + j);
					break;
				}
			}
		}
		
		// Números negativos
		int number = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] < 0) {
					number++;
				}
			}
		}
		System.out.println("Números negativos encontrados: " + number);
	}
}
