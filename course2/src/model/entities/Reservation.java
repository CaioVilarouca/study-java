package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer  rooNumber;
	private Date checkIn;
	private Date checkOut;
	
	//  Method é static para q não seja criado mais de um SimpleDateFormat para cada objeto Reservation 
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Mascara
	
	public Reservation() {
		
	}

	public Reservation(Integer rooNumber, Date checkIn, Date checkOut) {
		super();
		this.rooNumber = rooNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRooNumber() {
		return rooNumber;
	}

	public void setRooNumber(Integer rooNumber) {
		this.rooNumber = rooNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {// Calc o dia
	    long diff = checkOut.getTime() - checkIn.getTime();
	    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void uptade(Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new IllegalArgumentException("Reservation dates for update must be future dates");
		}
		if (!checkOut.after(checkOut)) {
			throw new IllegalArgumentException("Reservation date for update must be future dates");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Room " + rooNumber + ", check-in: " + sdf.format(checkIn) + ", check.out: " + sdf.format(checkOut) + ", " + duration() + " nights";
	}
}
