package backend;

public class Stock {
	private String name;
	private Double value;
	
	public Stock(String name, Double value) {
		this.name = name;
		this.value = value;
	}

	public Double getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
}
