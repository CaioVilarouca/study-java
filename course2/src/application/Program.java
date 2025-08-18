package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
											
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = scanner.nextInt();
		System.out.print("Check-in date dd/MM/YYYY: ");
		// Obj date        sdf.parse vai convert para tipo date   o scanner.next
		Date checkIn = sdf.parse(scanner.next());
		System.out.print("Check-out date dd/MM/YYYY: ");
		// Obj date        sdf.parse vai convert para tipo date   o scanner.next
		Date checkOut = sdf.parse(scanner.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation" + reservation);
		}
		
		scanner.close();
	}

}
