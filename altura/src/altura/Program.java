package altura;


import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number, ager, cont = 0;
		String name;
		double height, printResultHeight = 0, resultPorcent;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		number = scanner.nextInt();
		
		Document[] document = new Document[number];
		
		for(int i = 0; i < document.length; i++) {
			System.out.println("Dados da " + (i + 1)  + " primeira pessoa.");
			System.out.print("Name: ");
			name = scanner.next();
			System.out.print("idade: ");
			ager = scanner.nextInt();
			System.out.print("Altura: ");
			height = scanner.nextDouble();
			
			document[i] = new Document(name, ager, height);
		}
		
		for (Document print : document) {
			printResultHeight = print.resultHeight(print.getHeight(), printResultHeight);
			
			if (print.getAger() < 16) {
				cont++;
			}
			
		}
		System.out.printf("Altura média: %.2f", printResultHeight / document.length);
		
		resultPorcent = cont * 100.0 / number;  
		System.out.printf("\nPessoas  com menos de 16 anos: %.1f", resultPorcent);
		
		for (Document list : document) {
			if (list.getAger() < 16) {
				System.out.print(list.getName());
			}
		}
	}

}
