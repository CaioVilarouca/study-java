package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

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

		System.out.println("D01 = " + d01);
		System.out.println("D02 = " + d02);
		System.out.println("D03 = " + d03);
		System.out.println("D04 = " + d04);
		System.out.println("D05 = " + d05);
		System.out.println("D06 = " + d06);
		System.out.println("D07 = " + d07);

	}
}
