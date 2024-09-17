package application;

import java.util.Scanner;
import entites.Triangle;
import entites.SumSqrt;

public class Program {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		SumSqrt sum = new SumSqrt();
		Triangle triangleX = new Triangle();
		Triangle triangleY = new Triangle();

		System.out.println("Dados do triângulo X");
		triangleX.sideA = scanner.nextDouble();
		triangleX.sideB = scanner.nextDouble();
		triangleX.sideC = scanner.nextDouble();
		System.out.println("Dados do triângulo Y");
		triangleY.sideA = scanner.nextDouble();
		triangleY.sideB = scanner.nextDouble();
		triangleY.sideC = scanner.nextDouble();

		System.out.printf("X area %.4f", sum.area(triangleX));
		System.out.printf("\nY area %.4f\n",sum.area(triangleY));
		
		if(sum.area(triangleX) > sum.area(triangleY)) {
			System.out.println("Maior area X");
		}else {
			System.out.println("Maior area Y");
		}

		scanner.close();
	}
}
