package application;

import java.util.Locale;
import java.util.Scanner;

import enities.Peolpe;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quabtas pessoas serao digitadas: ");
		int number = scanner.nextInt();
		
		Peolpe[] vect = new Peolpe[number];
		
		for (int i=0;i<vect.length;i++) {
			System.out.println("Dados da "+(i+1)+" pessoa: ");
			System.out.print("Nome: ");
			String name = scanner.next();
			System.out.print("Idade :");
			int age = scanner.nextInt();
			System.out.print("Altura :");
			double height = scanner.nextDouble();
			
			vect[i] = new Peolpe(name,age,height);
		}
		double sumHeight=0;
		double sumAge=0;
		for (Peolpe x : vect) {
			sumHeight+=x.getHeight();
			if (x.getAge() < 16) {
				sumAge++;
			}
		}
		System.out.printf("Altura média %.2f\n", sumHeight/number);
		System.out.printf("Pessoas com menos de 16 anos: %.1f", (sumAge*100)/number);
		System.out.print("%\n");
		for (Peolpe x : vect) {
			if (x.getAge() < 16) {
				System.out.println(x.getName());
			}
		}
		scanner.close();
	}

}
