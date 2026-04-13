package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Informe o valor do vetor até 10: ");
		int number=scanner.nextInt();
		if (number>10)
			number=10;
		int[] vect=new int[number];
		for(int i=0;i<vect.length;i++) {
			System.out.print("Informe: ");
			int value=scanner.nextInt();
			vect[i]=value;
		}
		System.out.println("Números negativos:");
		for (int x:vect) {
			if (x<0)
				System.out.println(x);
		}
		scanner.close();
	}
}
