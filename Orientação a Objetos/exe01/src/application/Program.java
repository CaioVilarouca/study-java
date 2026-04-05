package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Triangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Triangle x = null,y = null;
		for(int i=0;i<2;i++){
			if (i==0)
				System.out.println("Enter the measures of triagle X:");
			else 
				System.out.println("Enter the measures of triagle y:");
			double a=scanner.nextDouble();
			double b=scanner.nextDouble();
			double c=scanner.nextDouble();
			if (i==0)
				x=new Triangle(a, b, c);
			else 
				y=new Triangle(a, b, c);
		}
		double areaX = x.counter();
		double areaY = y.counter();
		if (areaX > areaY)
			System.out.println("Larger area X:");
		else 
			System.out.println("Larger area Y:");		
		System.out.printf("Triangle area X %.4f \n",areaX);
		System.out.printf("Triangle area Y %.4f",areaY);
		scanner.close();
	}
}
