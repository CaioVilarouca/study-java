package model.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entites.Employee;
import model.entites.TaxContract;
import services.Contract;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	public void system() {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String name = scanner.nextLine();
		System.out.print("Sálario bruto: ");
		try {
			double salaryGross = scanner.nextDouble();
			System.out.print("Taxa: ");
			double tax = scanner.nextDouble();
			
			Employee employee = new Employee(name, salaryGross);
			TaxContract taxContract = new TaxContract(tax);
			
			Contract contract = new Contract(employee, taxContract);
			
			contract.result();
			System.out.print("\nValor da %: ");
			taxContract.setPercentage(scanner.nextDouble());
			contract.update();
			
		} catch (InputMismatchException e) {
			System.out.println("ERRO input variável. ");
		}
		scanner.close();
	}
}
