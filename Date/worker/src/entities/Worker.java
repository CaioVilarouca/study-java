package entities;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import services.HourContract;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private List <HourContract> listContract = new ArrayList<>();
	private Department departement;
	
	public Worker() {}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department departement) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departement = departement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void addContract(HourContract contract) {
		listContract.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		listContract.remove(contract);
	}
	
	
	public Department getDepartement() {
		return departement;
	}

	public void setDepartement(Department departement) {
		this.departement = departement;
	}

	public double income(int year, Month month) {
		double sum =0;
		for (HourContract x : listContract) {
			if (x.getDate().getYear() == year && x.getDate().getMonth() == month) {			
				sum += x.totalValue();
			}
		}
		return sum+baseSalary;
	}

	
}
