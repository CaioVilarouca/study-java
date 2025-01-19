package altura;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number, ager;
		String name;
		double height;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		number = scanner.nextInt();
		
		Document[] document = new Document[number];
		
		for(int i = 0; i < document.length; i++) {
			System.out.println("Dados da " + (i + 1)  + " primeira pessoa.");
			System.out.print("Nome: ");
			name = scanner.next();
			System.out.print("Idade: ");
			ager = scanner.nextInt();
			System.out.print("Altura: ");
			height = scanner.nextDouble();
			
			document[i] = new Document(name, ager, height);
		}
		
		for (Document print : document) {
		}
	}

}
