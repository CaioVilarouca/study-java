package entities;

public class Employee {
	private String name;
	private Double grossSalary;
	private Double tax;
	
	public Employee() {}
	public Employee(String name, Double grossSalary, Double tax) {
		super();
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return getGrossSalary()-getTax();
	}
	
	public double increaseSalary(double percentage) {
		return netSalary()+((getGrossSalary()*percentage)/100.0);
	}	
}
