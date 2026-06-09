package calculosComDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate menosDias = d01.minusDays(7);
		LocalDate maisDias = d01.plusDays(7);

		System.out.println("menosDias "+ menosDias);
		System.out.println("maisDias "+ maisDias +"\n");
		
		Instant menosDiasInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant maisDiasInstant = d03.plus(7, ChronoUnit.DAYS);

		System.out.println("menosDiasInstant "+ menosDiasInstant);
		System.out.println("maisDiasInstant "+ maisDiasInstant +"\n");
		
		Duration t = Duration.between(menosDias.atTime(0,0), d02);
		System.out.println(t.toDays());
	}
}
