package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.Contrato;

public class Programa {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Número: ");
		int numero = scanner.nextInt();
		System.out.print("Data (dd/MM/yyyy):");
		LocalDate data = LocalDate.parse(scanner.next(), dateTimeFormatter);
		System.out.print("Valor do contrato: ");
		double valorTotal = scanner.nextDouble();
		System.out.print("Entre com o numero de parcela: ");
		int quantidadeParcelas = scanner.nextInt();
		
		Contrato contrato = new Contrato(numero, data, valorTotal);
		
		scanner.close();
	}
}
