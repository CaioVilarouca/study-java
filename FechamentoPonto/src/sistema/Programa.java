package sistema;

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
		
			System.out.print("Informe o numero de colaboradores: ");
			int numeroColaboradores = scanner.nextInt();
			
			// Quantidade de empregado
			for (int i = 0; i < numeroColaboradores; i++) {
				
				System.out.print("Colaborador terceirizado? S/N: ");
				char resultado = scanner.next().charAt(0);
				
				// Coletando os dados do empregado
				System.out.println("Registro do empregado " + (i + 1));
				
				System.out.print("Nome: ");
				String nome = scanner.next();
				
				System.out.print("Horas trabalhada: ");
				Double horasTrabalhadas = scanner.nextDouble();
				
				System.out.print("Valor da hora :");
				Double valorHora = scanner.nextDouble();
				
				// Verficando se e um colaborador terceirizado
				if (resultado == 'S' || resultado == 's') {
					
					System.out.print("Bonus :");
					Double bonus = scanner.nextDouble();
					Empregado empregado = new EmpregadoTerceirizado(nome, horasTrabalhadas, valorHora, bonus);
					
				}else if (resultado == 'N' || resultado == 'n') {
					Empregado empregado = new Empregado(nome, horasTrabalhadas, valorHora);
				} else {
					System.out.println("ERRO! Valor informado [ " + resultado + " ]");
				}
				
				System.out.println("---------------------------------------");
			}
			

			
			
		scanner.close();
	}
}
