package convertendodataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2026-10-02");
		LocalDateTime d02 = LocalDateTime.parse("2026-10-02T01:30:26");
		// Para formatar um Instant, passar o fuso horário primeiro 
		Instant d03 = Instant.parse("2026-10-02T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
																				//	Ele pega o fusu horário do PC do usuário
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());


		
		System.out.println("d01 "+ fmt1.format(d01));
		System.out.println("d01 "+ d01.format(fmt1)+ "\n");
		
		System.out.println("d02 "+ fmt1.format(d02));
		System.out.println("d02 "+ d02.format(fmt2)+ "\n");
		
		System.out.println("d03 "+ fmt3.format(d03)+ "\n");
	}
}
