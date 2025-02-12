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
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}	
		
		// Posição da busca
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == position) {
					System.out.println("Posição: " + i + ", " + j);
					if (j > 0) {
						System.out.println("Esquerda : " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Topo : " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Direita : " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Embaixo : " + matriz[i+1][j]);
					}				
				}
			}
		}
	}
}
