package Program;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		new  Start().start();
	}
	
	public void start() {
		Scanner scanner  =  new Scanner(System.in);

		int number = 3;
		int[][] matriz = new int[number][number];
		
		for (int line = 0; line < matriz.length; line++) {
			for (int column = 0; column < matriz.length; column++) {
				matriz[line][column] = scanner.nextInt();
			}
		}
		
		for (int line = 0; line < matriz.length; line++) {
			for (int column = 0; column < matriz.length; column++) {
				System.out.println(matriz[line][column]);
			}
		}
		scanner.close();
	}
}
