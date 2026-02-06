package model.entites;

import java.util.ArrayList;
import java.util.List;

public class Registe {
	private List <Employee> registerData = new ArrayList<>();
	private Boolean verification = true;

	public List<Employee> getRegisterData() {
		return registerData;
	}

	public void setRegisterData(List<Employee> registerData) {
		this.registerData = registerData;
	} 
	
	public void addList(Employee employee) {
		registerData.add(employee);
	}
	
	public void printList() {
		System.out.println("\nList de colaboradores:");
		for (Employee employee : registerData) {
			System.out.println(employee.getID() +", "+ employee.getName() + ", "+ employee.getSalary());
		}
	}
	
	public void steam(int id){
		
		for (Employee x : registerData) {
			if (x.getID().equals(id)) 
				 return;
			else 
				verification = false;
		}
		
		if (!verification)
			throw new IllegalArgumentException("ID não encontrado.");			
	}
	
	public double update(double amount, int id) {
		double updateSalary=0;
		for (Employee employee : registerData) {
			if (employee.getID() == id) {
				updateSalary = employee.getSalary()+((employee.getSalary() * 10) / 100);
				employee.setSalary(updateSalary);
			}
		}
		return updateSalary;
	}
}
