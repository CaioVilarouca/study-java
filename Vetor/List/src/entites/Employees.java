package entites;

public class Employees {
	private Integer id;
	private String name;
	private Double salary;

	public Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("%d, %s, %.2f",id,name,salary);
	}
}
