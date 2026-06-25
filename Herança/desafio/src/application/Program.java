package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List <Pessoa> list = new ArrayList<>();
		
		System.out.print("Informe o número de pessoas: ");
		int number = scanner.nextInt();
		
		for(int i=1;i<=number;i++) {
			System.out.print("Pessoa fisíca ou jurídica (i/c):");
			char status = scanner.next().charAt(0);
			System.out.print("Nome: ");
			String nome = scanner.next();
			System.out.print("Renda atual: ");
			double rendaAtual = scanner.nextDouble();
			if (status == 'i') {
				System.out.print("Gasto com saúde: ");
				double saude = scanner.nextDouble();
				list.add(new Fisica(nome, rendaAtual, saude));
			}
			if (status == 'c') {
				System.out.print("colaboradores: ");
				int colaborador = scanner.nextInt();
				list.add(new Juridica(nome, rendaAtual, colaborador));
			}
		}
		System.out.println("\n resultado \n");
		double sum =0;
		for (Pessoa x : list) {
			sum+=x.imposto();
			System.out.println(x.getNome() +": $"+ String.format("%.2f", x.imposto()));
		}
		System.out.print("\nTotal $" + sum);
		scanner.close();
	}
}
