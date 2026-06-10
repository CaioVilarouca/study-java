package application;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.WorkerLevel;
import services.HourContract;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a profissão: ");
		String departmentName = scanner.nextLine();
		System.out.println("Informe os dados:");
		System.out.print("Nome:");
		String name = scanner.nextLine();
		System.out.print("Cargo:");
		String level = scanner.next();
		System.out.print("Salário bruto R$");
		double salary = scanner.nextDouble();
		System.out.print("Informe o quantidade de contratos? ");
		int amount = scanner.nextInt();
	
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(departmentName));

		for(int i=0;i<amount;i++) {
			System.out.println("\nInforme o #"+(i+1)+" :");
			System.out.print("Data (DD/MM/YYYY): ");
			LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.print("Valor por hora R$");
			double hours = scanner.nextDouble();
			System.out.print("Duração (horas): ");
			int duration = scanner.nextInt();
			
			HourContract hourContract = new HourContract(date,hours,duration);
			worker.addContract(hourContract);
		}
		
		System.out.print("\nInforme a data para puxar os extrato (MM/YYY):");
		YearMonth income = YearMonth.parse(scanner.next(), DateTimeFormatter.ofPattern("MM/yyyy"));
		double result = worker.income(income.getYear(), income.getMonth());
		
		System.out.printf("Name: %s \nDepartamento: %s \nResultado %s: R$%.2f \n", worker.getName(), worker.getDepartement().getName(), income.format(DateTimeFormatter.ofPattern("MM/yyyy")), result);
		scanner.close();
	}
}
