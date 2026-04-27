package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int number2 = scanner.nextInt();
		int[][] vect = new int[number][number2];
		
		for(int i=0;i<vect.length;i++)
			for(int j=0;j<vect.length;j++)
				vect[i][j] = scanner.nextInt();
		
		System.out.print("Query: ");
		scanner.nextLine();
		int query = scanner.nextInt();
		
		for(int i=0;i<vect.length;i++) {
			for(int j=0;j<vect.length;j++) {
				if(vect[i][j]==query) {
					System.out.print("\nPosition:"+i+", "+j);
					
					if (j > 0) {
						System.out.println("Left: " + vect[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + vect[i-1][j]);
					}
					if (j < vect[i].length-1) {
						System.out.println("Right: " + vect[i][j+1]);
					}
					if (i < vect.length-1) {
						System.out.println("Down: " + vect[i+1][j]);
					}
				}
			}
		}
		scanner.close();
	}
}
