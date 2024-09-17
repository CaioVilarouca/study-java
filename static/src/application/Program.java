package application;

import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre radius: ");
		
		double radius = scanner.nextDouble();
		double circumference = Calculator.circumference(radius);
		double volume = Calculator.volume(radius);
		
		System.out.printf("Circuference %.2f \n", circumference);
		System.out.printf("Volume %.2f \n", volume);
		System.out.printf("PI value %.2f", Calculator.PI);
		scanner.close();
	}
}
