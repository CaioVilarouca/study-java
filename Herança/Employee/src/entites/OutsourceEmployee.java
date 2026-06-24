package entites;

public final class OutsourceEmployee extends Employee {
	private Double additionalCharge;
	
	public OutsourceEmployee () {
		super();
	}

	public OutsourceEmployee(String name, Double hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final double payment() {
		return super.payment() + additionalCharge * 110.0 / 100.0;
	}
	
	
}
