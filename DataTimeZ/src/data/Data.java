package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
	public static void main (String[] args) {
		new Data().start();
	}
	public void start() {
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();	
		// Data global
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2004-10-02");
		LocalDateTime d05 = LocalDateTime.parse("2004-10-02T23:45:10");
		
		// Global 
		Instant d06 = Instant.parse("2004-10-02T05:45:10Z");
		Instant d07 = Instant.parse("2004-10-02T05:45:10-03:00");// Adiantado
		
		//DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//LocalDate d08 = LocalDate.parse("10/02/2004", fmt1);
		LocalDate d08 = LocalDate.parse("10/02/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("10/02/2004 06:24", fmt2);
		
		LocalDate d10 = LocalDate.of(2004, 02, 10);
		LocalDateTime d11 = LocalDateTime.of(2004, 02, 10, 03, 45);
		
		System.out.println("D01 = " + d01);
		System.out.println("D02 = " + d02);
		System.out.println("D03 = " + d03);
		System.out.println("D04 = " + d04);
		System.out.println("D05 = " + d05);
		System.out.println("D06 = " + d06);
		System.out.println("D07 = " + d07 + "\n");
		System.out.println("fmt1 = " + d08);
		System.out.println("fmt2 = " + d09 + "\n");
		System.out.println("D10 = " + d10);
		System.out.println("D11 = " + d11);


	}
}
