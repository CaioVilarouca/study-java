package entities;

public class HubStock {
	private Integer amount;
	
	public HubStock(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return " " + amount;
	}	
}
