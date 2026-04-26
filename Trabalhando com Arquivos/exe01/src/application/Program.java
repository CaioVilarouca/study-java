package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		// Path  do fil
		File file = new File("/home/caio/Documentos/Java/Trabalhando com Arquivos/in.txt");
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		}finally {
			if (scanner != null)
				scanner.close();
		}
	}
}
