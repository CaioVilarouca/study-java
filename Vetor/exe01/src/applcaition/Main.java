package applcaition;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		
		double[] vect = new double[number];
		
		for(int i=0;i<vect.length;i++)
			vect[i] = scanner.nextDouble();
		
		double sum=0.0;
		for (double x : vect) {
			sum+=x;
		}

		System.out.printf("AVERAGE HEIGHT = %.2f",sum/number);
		scanner.close();
	}
}
