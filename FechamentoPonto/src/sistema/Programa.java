package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import contratosTrabalhista.Empregado;
import contratosTrabalhista.EmpregadoTerceirizado;

public class Programa {
	public static void main(String[] args) {
		new Programa().inicio();
	}
	
	public void inicio() {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
				
			// Registro de empregados da empresa
			List <Empregado> registroColaboradores = new ArrayList<>();
		
			System.out.print("Informe o numero de colaboradores: ");
			int numeroColaboradores = scanner.nextInt();
			
			// Quantidade de empregado
			for (int i = 0; i < numeroColaboradores; i++) {
				
				System.out.print("Colaborador terceirizado? S/N: ");
				char resultado = scanner.next().charAt(0);
				
				// Coletando os dados do empregado
				System.out.println("Registro do empregado " + (i + 1));
				
				System.out.print("Nome: ");
				scanner.nextLine();// Consumir a quebra de linha
				String nome = scanner.nextLine();
				
				System.out.print("Horas trabalhada: ");
				Double horasTrabalhadas = scanner.nextDouble();
				
				System.out.print("Valor da hora :");
				Double valorHora = scanner.nextDouble();
				
				// Verficando se e um colaborador terceirizado
				Double bonus = 0.0;
				if (resultado == 'S' || resultado == 's') {
					System.out.print("Bonus :");
					bonus = scanner.nextDouble();
					
					// Add
					Empregado empregado = new EmpregadoTerceirizado(nome, horasTrabalhadas, valorHora, bonus);
					registroColaboradores.add(empregado);
					
				} else if (resultado == 'N' || resultado == 'n') {
				    System.out.println("Sem bônus.");
				    
				    // Add 
					Empregado empregado = new Empregado(nome, horasTrabalhadas, valorHora);
					registroColaboradores.add(empregado);

				} else {
				    System.out.println("ERRO! Valor informado [ " + resultado + " ]");
				}							
				System.out.println("---------------------------------------");
			}
	

			System.out.println("Registro:");
			for (Empregado lista : registroColaboradores) {
				System.out.println(lista.getNome() + " R$"  + String.format(" %.2f",  lista.calcRedimentos()));
			}
		
			
		scanner.close();
	}
}
