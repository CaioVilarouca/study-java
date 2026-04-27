package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[][] matrix = new int[num][num];
		
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix.length;j++)
				matrix[i][j] = scanner.nextInt();
		
		System.out.println("\nMain Diagonal");
		int counter=0;
		for(int i=0;i<matrix.length;i++) {
			System.out.print(matrix[i][i] +" ");
			for(int j=0;j<matrix.length;j++) {
				if(matrix[i][j] < 0)
					counter++;
			}
		}
		System.out.println("\nNegative numbers = "+counter);
		scanner.close();
	}
}
