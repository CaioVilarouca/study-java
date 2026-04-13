package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a quantidade a digitar: ");
		int number = scanner.nextInt();
		int[] vect = new int[number];
		for (int i=0;i<vect.length;i++) {
			System.out.print("Digite o número: ");
			int num = scanner.nextInt();
			vect[i] = num;
		}
		System.out.println("Números PAR:");
		int sum=0;
		for (int x : vect) {
			if (x % 2 ==0) {
				System.out.print(x+ " ");
				sum++;
			}
		}
		System.out.println("\nQuantidade de para = "+sum);
		scanner.close();
	}

}
