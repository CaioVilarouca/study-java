package model.entites;

public class TaxContract {
	private Double tax;
	private Double percentage;
	
	public TaxContract() {}

	public TaxContract(Double tax) {
		this.tax = tax;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	
	
}
	
