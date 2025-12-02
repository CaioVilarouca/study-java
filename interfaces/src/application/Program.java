package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

import model.intites.AluguelDeCarro;
import model.intites.Carro;

public class Program {
	public static void main (String [] args) {
		new Program().sistema();
	}
	
	public void sistema() {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		coletaDeInfo(scanner);
		
		scanner.close();
	}
	
	public void coletaDeInfo(Scanner scanner) {
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		try {
			System.out.println("Entre com os dados do aluguel.");
			System.out.print("Modelo do carro: ");
			String modeloDoCarro = scanner.nextLine();
			System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
			LocalDateTime inicio = LocalDateTime.parse(scanner.nextLine(), formatar);
			System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
			LocalDateTime fim = LocalDateTime.parse(scanner.nextLine(), formatar);
			
			AluguelDeCarro alugelDeCarro = new AluguelDeCarro(inicio, fim, new Carro(modeloDoCarro));
			
		} catch (DateTimeParseException e) {
			System.out.println("Erro na LocalDateTime " + e.getMessage());
		}
	}
	
}
