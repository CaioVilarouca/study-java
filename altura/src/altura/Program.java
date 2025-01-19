package altura;

import java.awt.print.Printable;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number, ager;
		String name;
		double height, printResultHeight = 0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		number = scanner.nextInt();
		
		Document[] document = new Document[number];
		
		for(int i = 0; i < document.length; i++) {
			System.out.println("Dados da " + (i + 1)  + " primeira pessoa.");
		
			System.out.print("Altura: ");
			height = scanner.nextDouble();
			
			document[i] = new Document("caio", 0, height);
		}
		
		for (Document print : document) {
			printResultHeight = print.resultHeight(print.getHeight(), printResultHeight);
		}
		System.out.printf("Altura média: %.2f", printResultHeight / document.length);
	}

}
