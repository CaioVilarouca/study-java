package converterDataHoraGlobalParaLocal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2004-10-02");
		LocalDateTime d02 = LocalDateTime.parse("2026-10-02T01:30:26");
		// Para formatar um Instant, passar o fuso horário primeiro 
		Instant d03 = Instant.parse("2026-10-02T01:30:26Z");
		
		LocalDate result01 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime result02 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

		
		System.out.println("r1 "+ result01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("r2 "+ result02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))+"\n");

		System.out.println("dia "+d01.getDayOfMonth());
		System.out.println("mês "+d01.getMonthValue());
		System.out.println("ano "+d01.getYear()+"\n");
		
		System.out.println("Hora "+d02.getHour());
		System.out.println("Minutos "+d02.getMinute());
		System.out.println("segundos "+d02.getSecond());




		
		for (String s : ZoneId.getAvailableZoneIds()){
			//System.out.println(s);
		}
	}
}
