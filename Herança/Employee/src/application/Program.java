package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Employee;
import entites.OutsourceEmployee;
import services.ListServices;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	public void system() {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		ListServices listServices = new ListServices();
		
		System.out.print("Informe o número de colaboradores: ");
		int numberEmployee = scanner.nextInt();
		
		for(int i=1; i<=numberEmployee;i++) {
			System.out.println("Colaborador #"+i+" cadastro:");
			System.out.print("Terceirizado [S|N]: ");
			char outsource = scanner.next().charAt(0);
			System.out.print("Nome: ");
			String name = scanner.next();
			System.out.print("Quantas horas trabalhadas: ");
			double hours = scanner.nextDouble();
			System.out.print("Valor por hora: ");
			double valuePerHour = scanner.nextDouble();
			
			if (outsource == 's' || outsource == 'S') {
				System.out.print("Informe gastos adicionais: ");
				double additional = scanner.nextDouble();
				
				Employee employee = new OutsourceEmployee(name, hours, valuePerHour, additional);
				listServices.add(employee);
			} else {
				Employee employee = new Employee(name, hours, valuePerHour);
				listServices.add(employee);
			}
		}
		
		System.out.println("\nLista");
		for (Employee x : listServices.getList()) {
		    System.out.println(x.getName() + " - $" + String.format("%.2f", x.payment()));
		}
		
		scanner.close();
	}
}
