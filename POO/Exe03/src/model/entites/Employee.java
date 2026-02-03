package model.entites;

public class Employee {
	private String name;
	private Double GrossSalary;
	
	public Employee() {}
	
	public Employee(String name, double GrossSalary) {
		this.name = name;
		this.GrossSalary = GrossSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrossSalary() {
		return GrossSalary;
	}

	public void setGrossSalary(Double grossSalary) {
		GrossSalary = grossSalary;
	}
	
	
}
