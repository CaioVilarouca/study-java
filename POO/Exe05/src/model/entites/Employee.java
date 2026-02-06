package model.entites;

public class Employee {
	private Integer ID;
	private String name;
	private Double Salary;
	
	public Employee(Integer iD, String name, Double salary) {
		this.ID = iD;
		this.name = name;
		this.Salary = salary;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}
	
}
