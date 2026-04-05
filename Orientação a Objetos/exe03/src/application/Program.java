package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	public void system() {
		Locale.setDefault(Locale.US);
		Scanner scanner=new Scanner(System.in);
		System.out.print("Nome: ");
		String name=scanner.nextLine();
		System.out.print("Gross salary: ");
		double grossSalary=scanner.nextDouble();
		System.out.print("Tax: ");
		double tax=scanner.nextDouble();
		Employee employee=new Employee(name,grossSalary,tax);
		System.out.printf("\nEmployee %s, $ %.2f\n",employee.getName(),employee.netSalary());
		System.out.printf("Which percentage to increase salary? ");
		double procentage=scanner.nextDouble();
		System.out.printf("\nUpdated data %s, $ %.2f\n",employee.getName(),employee.increaseSalary(procentage));
		scanner.close();
	}
}
