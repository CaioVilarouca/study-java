package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import services.RentalService;
import services.TaxBrazilService;

public class Program {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Entre com os dados do aluguel");
			System.out.print("Modelo do carro:");
			String model = scanner.nextLine();
			System.out.print("Retirada (dd/mm/yyyy hh:mm):");
			LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
			System.out.print("Retorno (dd/mm/yyyy hh:mm):");
			LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
			System.out.print("Informe o preço por HORA $");
			double price = scanner.nextDouble();
			System.out.print("infrome o preço por DIA $");
			double day = scanner.nextDouble();
			System.out.println("FATURA");
			CarRental carRental = new CarRental(start,finish,new Vehicle(model));
			RentalService rentalService = new RentalService(price,day, new TaxBrazilService());
			rentalService.processInvoice(carRental);
			System.out.print("\nPagamento basico: "+carRental.getInvoice().getBasicPayment());
			System.out.print("\nImposto: "+carRental.getInvoice().getTax());
			System.out.print("\nTotal: "+carRental.getInvoice().getTotalPayment());
		}catch (DateTimeParseException e) {
			System.out.println("Erro no cadastro de datas "+e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println("Erro no cadastro "+e.getMessage());
		}catch (IllegalArgumentException e) {
			System.out.println("Erro no cadastro "+e.getMessage());
		}
		scanner.close();
	}


}
