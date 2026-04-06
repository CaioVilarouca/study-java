package entities;

public class CurrencyConverter {
	private final static double TAX = 6.0;
	
	public static double amount(double price, double bought) {
		return ((price*bought)+((price*bought)*TAX)/100.0);
	}
}
