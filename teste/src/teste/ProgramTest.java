package teste;

import java.util.Scanner;

public class ProgramTest {
	public static void main(String[] args) {

				int number = 21;
			Object obj = number;
			int numberX = (int) obj;
			System.out.println(numberX);

			String[] vetor = new String[] {"Caio", "Vinício", "Nunes", "Vilarouca"};
			
			for (String x: vetor) {
				System.out.print(" " + x);
			}
	
	}
}
