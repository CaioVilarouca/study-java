package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Reservation;
import exception.DominException;
import services.ServicesReservation;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			System.out.print("Informe o número do quarto: ");
			int number = scanner.nextInt();
			System.out.print("Informe o início (DD/MM/YYYY): ");
			LocalDate checkin = LocalDate.parse(scanner.next(), dateTimeFormatter);
			System.out.print("Informe o fim (DD/MM/YYYY): ");
			LocalDate checkout = LocalDate.parse(scanner.next(), dateTimeFormatter);
			ServicesReservation servicesReservation = new ServicesReservation (new Reservation(number, checkin, checkout));
			servicesReservation.updateReservation(checkin, checkout);
			System.out.println("\nAtualizar a reserva\n");
			System.out.print("Informe o início (DD/MM/YYYY): ");
			LocalDate checkinUpdate = LocalDate.parse(scanner.next(), dateTimeFormatter);
			System.out.print("Informe o fim (DD/MM/YYYY): ");
			LocalDate checkoutUpdate = LocalDate.parse(scanner.next(), dateTimeFormatter);
			servicesReservation.updateReservation(checkinUpdate, checkoutUpdate);

		} catch (InputMismatchException e) {
			System.out.println("Error na reserva = "+e);
		} catch (DateTimeParseException e) {
			System.out.println("Error na reserva = "+e);
		} catch (DominException e) {
			System.out.println("Error na reserva: "+ e.getLocalizedMessage());
		}
		scanner.close();
	}
}
