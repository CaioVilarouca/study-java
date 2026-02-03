package services;

import model.entites.Employee;
import model.entites.TaxContract;

public class Contract {
	private Employee employee;
	private TaxContract taxContract;

	public Contract(Employee employee, TaxContract taxContract) {
		this.employee = employee;
		this.taxContract = taxContract;
	}
	
	public void result() {
		System.out.printf("Colaborado: %s, R$%.3f", employee.getName(), employee.getGrossSalary()-taxContract.getTax());
	}
	
	public void update() {
		System.out.printf("\nUpdate R$%.3f",(employee.getGrossSalary()-taxContract.getTax())+(employee.getGrossSalary()*taxContract.getPercentage()/100.0));
	}
}
