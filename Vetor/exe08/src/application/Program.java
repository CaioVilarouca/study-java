package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o tamanho do vetor: ");
		int value = scanner.nextInt();
		int[] vect = new int[value];
		double amountPar=0, sumPar=0;;
		for (int i=0;i < vect.length;i++) {
			System.out.print("Informe um número: ");
			int number = scanner.nextInt();
			if (number % 2==0) {
				vect[i]=number;
				sumPar+=number;
				amountPar++;
			}
		}
		if (amountPar == 0) 
			System.out.println("NENHUM NUMERO PAR");
		else 
			System.out.printf("MEDIA DOS PARES = %.2f", (sumPar/amountPar));
		scanner.close();
	}
}
