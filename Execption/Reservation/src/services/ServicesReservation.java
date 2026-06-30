package services;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.Reservation;
import exception.DominException;

public class ServicesReservation {
	private Reservation reservation;
	private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static LocalDate nowDate = LocalDate.now();
	
	public ServicesReservation() {}

	public ServicesReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	public long duration(LocalDate checkin, LocalDate checkout) {
		Duration duration = Duration.between(checkin.atStartOfDay(),checkout.atStartOfDay());
		return duration.toDays();
	}
	
	public void updateReservation(LocalDate checkin, LocalDate checkout) {
		if (checkin.equals(checkout)) { // Regras de negócio
			throw new DominException("A data Check-out "+checkin.format(dateTimeFormatter)+", não pode ser IGUAL que a de Check-in "+checkout.format(dateTimeFormatter));
		}
		
		if (checkin.isBefore(nowDate) || checkout.isBefore(nowDate)) {
			throw new DominException("A data informada, é ANTERIOR de agora "+nowDate.format(dateTimeFormatter));
		}  
		
		if (checkin.isAfter(checkout)) {
			throw new DominException("A data Check-out "+checkout.format(dateTimeFormatter)+", não pode ser MENOR que a de Check-in "+checkin.format(dateTimeFormatter));
		} 
		
		System.out.printf("Reserva: número [%d], check-in %s, check-out %s, [%d]Dias",
				reservation.getNumber(),
				checkin.format(dateTimeFormatter),
				checkout.format(dateTimeFormatter),
				duration(checkin,checkout)
		);
	}
}
