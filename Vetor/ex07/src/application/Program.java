package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor: ");
		int amount=scanner.nextInt();
		int[] vectX = new int[amount];
		int[] vectY = new int[amount];
		System.out.println("Digite os valores do vetor A:");
		for(int i=0;i<vectX.length;i++) {
			int number = scanner.nextInt();
			vectX[i]=number;
		}
		System.out.println("Digite os valores do vetor B:");
		for(int i=0;i<vectY.length;i++) {
			int number = scanner.nextInt();
			vectY[i]=number;
		}
		System.out.println("VETOR RESULTANTE:");
		for(int i=0;i<vectY.length;i++) {
			System.out.println(vectY[i] + vectX[i]);
		}			
		scanner.close();
	}

}
