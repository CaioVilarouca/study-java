import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate c04 = LocalDate.parse("2004-02-10");
		LocalDateTime c05 = LocalDateTime.parse("2004-07-20T01:30:26");
		Instant c06 = Instant.parse("2004-07-20T01:30:26z");
		
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		
		System.out.println("C04 " + c04);
		System.out.println("C04 formatado " + c04.format(fm1));
		
		System.out.println("C05 " + c05);
		System.out.println("C05 formatado " + c05.format(fm2));



	}
}
