package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			int x=scanner.nextInt();
			if (x==2002) {
				System.out.println("Acesso Permitido");
				break;
			}else
				System.out.println("Acesso Negado");
		}
		scanner.close();
	}
}
