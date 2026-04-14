package application;

import java.util.Scanner;

import entities.Peolpe;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	public void system() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o número de pessoas: ");
		int number = scanner.nextInt();
		Peolpe[] peolpe = new Peolpe[number];
		for (int i=0;i<peolpe.length;i++) {
			System.out.println("Dados da "+(i+1)+" pessoa:");
			System.out.print("Nome: ");
			String name=scanner.next();
			System.out.print("Idade: ");
			int aye=scanner.nextInt();
			peolpe[i] = new Peolpe(name,aye);
		}
		String result=null;
		int sum=0;
		for(Peolpe x : peolpe) {
			if (x.getAge() > sum ) {
				sum = x.getAge();
				result = x.getName();
			}
		}
		System.out.println("Pessoa mais velha: "+ result);
		scanner.close();
	}
}
