package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

import model.intites.AluguelDeCarro;
import model.intites.Carro;
import model.services.AlugelServico;
import model.services.BrasilTaxaServico;

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
			// LocalDateTime inicio = LocalDateTime.parse(scanner.nextLine(), formatar);
			LocalDateTime inicio = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
			
			System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
			LocalDateTime fim = LocalDateTime.parse(scanner.nextLine(), formatar);
			
			// Carro carro = new Carro(modeloDoCarro);
			// AluguelDeCarro alugelDeCarro = new AluguelDeCarro(inicio, fim, carro);
			
			AluguelDeCarro alugelDeCarro = new AluguelDeCarro(inicio, fim, new Carro(modeloDoCarro));
			
			System.out.print("Entre com preço por hora: ");
			double precoPorHora = scanner.nextDouble();
			System.out.print("Entre com preço por dia: ");
			double precoPorDia = scanner.nextDouble();
			
			AlugelServico aluguelServico = new AlugelServico(precoPorHora, precoPorDia, new BrasilTaxaServico());
			aluguelServico.processamentoFatura(alugelDeCarro);
			
			System.out.println("FATURA: ");
			System.out.println("Pagamento basíco " + alugelDeCarro.getFatura().getPagamento());
			System.out.println("Imposto: " + alugelDeCarro.getFatura().getTaxa());
			System.out.println("Pagamento total " + alugelDeCarro.getFatura().getPagamentoTotal());
			
		} catch (DateTimeParseException e) {
			System.out.println("Erro na LocalDateTime " + e.getMessage());
		}
	}
	
}
