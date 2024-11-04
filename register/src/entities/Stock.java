package entities;

public class Stock {
	private String[] stockName = new String[3];
	private Integer[] stockAmount = new Integer[3];
	private Double[] stockValue = new Double[3];


	public void stockRegister(String name, int amount, double value) {
		for (int i = 0; i < 3; i++) {
			stockName[i] = name;
			stockAmount[i] = amount;
			stockValue[i] = value;
		}
	}
}
