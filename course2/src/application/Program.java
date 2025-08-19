package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {										
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = scanner.nextInt();
			System.out.print("Check-in date dd/MM/YYYY: ");
			// Obj date        sdf.parse vai convert para tipo date   o scanner.next
			Date checkIn = sdf.parse(scanner.next());
			System.out.print("Check-out date dd/MM/YYYY: ");
			Date checkOut = sdf.parse(scanner.next());

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation" + reservation);
				
			System.out.println("\nEnter data to update the reservation: ");
			System.out.print("Check-in date dd/MM/YYYY: ");
			checkIn = sdf.parse(scanner.next());
			System.out.print("Check-out date dd/MM/YYYY: ");
			checkOut = sdf.parse(scanner.next());
				 
			reservation.uptade(checkIn, checkOut);
			System.out.println("Reservation" + reservation);
			
			scanner.close();
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error in reservation: " + e.getMessage() );
		}
	}
}
