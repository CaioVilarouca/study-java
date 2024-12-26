package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Objetos declarados 
		Scanner scanner = new Scanner(System.in);
		Form form = new Form();
		
		// var
		String formName;
		double formHeight;
		double formWeight;
		
		try {
			// Input de dados do usuário
			System.out.print("Digite seu nome:");
			formName = scanner.nextLine();
			System.out.print("Digite sua altura:");
			formHeight = scanner.nextDouble();
			System.out.print("Digite peso:");
			formWeight = scanner.nextDouble();
			
			// Passando meu argumentos no construtor 
			System.out.printf("\n------- I M C -------");
			People people = new People(formName, formHeight, formWeight);
			
			// Chamando as funções do formulário
			System.out.printf("\nNome %s, IMC: %.2f \n", people.getName(), form.calculationImc(people));
			form.tableImc(people);
			
			scanner.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro de digitação");
		}
		
	}// Caio Vilarouca UDF

}
