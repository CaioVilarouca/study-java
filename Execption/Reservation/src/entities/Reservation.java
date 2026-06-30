package entities;

import java.time.LocalDate;

public class Reservation {
	private Integer number;
	private LocalDate checkin;
	private LocalDate checkout;
	
	public Reservation() {}

	public Reservation(Integer number, LocalDate checkin, LocalDate checkout) {
		super();
		this.number = number;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}
}
