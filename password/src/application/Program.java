package application;

import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		boolean sleep = true;
		Scanner scanner = new Scanner(System.in);
		while(sleep){
			System.out.print("Senha: ");
			int password = scanner.nextInt();
			if (password == 2004) {
				sleep = false;
				System.out.println("Acesso Permitido");
			}else{
				System.out.println("Senha invalida");
			}
		}
		scanner.close();
	}
}