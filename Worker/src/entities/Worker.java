package entities;

import entites.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel leve;
	private Double baseSalary;
	
	private Department department;
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel leve, Double baseSalary, Department department) {
		super();
		this.name = name;
		this.leve = leve;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLeve() {
		return leve;
	}

	public void setLeve(WorkerLevel leve) {
		this.leve = leve;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", leve=" + leve + ", baseSalary=" + baseSalary + ", department=" + department
				+ "]";
	}
}
