package entities;

public class Stock {
	private String[] nameStock = new String[3];
	private Integer[] amountStock = new Integer[3];
	private Double[] valueStock = new Double[3];
	
	public String[] getNameStock() {
		return nameStock;
	}
	public void setNameStock(String[] nameStock) {
		this.nameStock = nameStock;
	}
	public Integer[] getAmountStock() {
		return amountStock;
	}
	public void setAmountStock(Integer[] amountStock) {
		this.amountStock = amountStock;
	}
	public Double[] getValueStock() {
		return valueStock;
	}
	public void setValueStock(Double[] valueStock) {
		this.valueStock = valueStock;
	}
	
}
