package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Employees;
import services.SumSalary;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	public void system() {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int number = scanner.nextInt();
		
		List <Employees> list = new ArrayList<>();
		for(int i=0;i<number;i++) {
			System.out.println("\nEmployee #"+(i+1)+":");
			System.out.print("ID: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nome: ");
			String name = scanner.nextLine();
			System.out.print("Salary R$");
			double salary = scanner.nextDouble();
			
			list.add(new Employees(id,name,salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int queryID = scanner.nextInt();
		System.out.print("Enter the percentage: ");
		double percentage = scanner.nextDouble();
		
		SumSalary sumSalary = new SumSalary();
		boolean queryNo=true;
		
		for (Employees employees : list) {
			if(employees.getId()==queryID) {
				employees.setSalary(sumSalary.sum(percentage, employees.getSalary()));
				queryNo=false;
			}
		}
		
		if (queryNo) {
			System.out.println("\nID não foi encontrado: "+ queryID);
		}
		
		System.out.println("\nList Of Employees");
		for (Employees employees : list) {
			System.out.println(employees);
		}
		scanner.close();
	}
}
