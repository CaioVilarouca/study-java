package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Aluno;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	public void system() {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o números de alunos a ser digitados: ");
		int numero = scanner.nextInt();
		Aluno[] aluno = new Aluno[numero];
		for(int i=0;i<aluno.length;i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+" o aluno:");
			scanner.nextLine();
			String nome = scanner.nextLine();
			double nota01 = scanner.nextDouble();
			double nota02 = scanner.nextDouble();
			aluno[i] = new Aluno(nome,nota01,nota02);
		}
		System.out.println("Alunos aprovados: ");
		for(Aluno x:aluno) {
			if(((x.getNota01()+x.getNota02())/2.0)>= 6.0) {
				System.out.println(x.getNome());
			}
		}
		scanner.close();
	}
	
}
