package instanciandoDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main (String[] args) {
		LocalDate d01 = LocalDate.now();   // Data 
		LocalDateTime d02 = LocalDateTime.now(); // Data e hora GMT
		Instant d03 = Instant.now(); // Data e Hora Zulu
		
		LocalDate d04 = LocalDate.parse("2024-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2024-07-20T01:00:26");
		
		Instant d12 = Instant.parse("2024-07-20T01:00:26Z");
		Instant d06 = Instant.parse("2024-07-20T01:00:26-03:00");
		
		LocalDate d07 = LocalDate.parse("10/02/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime d08 = LocalDateTime.parse("10/02/2004 04:32", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d09 = LocalDate.of(2005, 03, 31);
		LocalDateTime d10 = LocalDateTime.of(2005, 03, 31, 1, 30);


		
		System.out.println("d01 "+d01);
		System.out.println("d02 "+d02);
		System.out.println("d03 "+d03);
		System.out.println("d04 "+d04);
		System.out.println("d05 "+d05);
		System.out.println("d12 "+d12);
		System.out.println("d06 "+d06);
		System.out.println("d07 "+d07);
		System.out.println("d08 "+d08);
		System.out.println("d09 "+d09);
		System.out.println("d10 "+d10);






	}
}
