package applicaton;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		if(numberA%numberB==0||numberB%numberA==0)
			System.out.println("São Multiplos");
		else 
			System.out.println("Não Multiplos");
		scanner.close();
	}

}
