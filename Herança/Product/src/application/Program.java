package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	public void system() {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List <Product> list = new ArrayList<>();
		
		System.out.print("Informe a quantidade de produtos :");
		int amount = scanner.nextInt();
		
		for(int i=1; i<=amount;i++) {
			System.out.print("Produto #"+i+" cadastro:\n");
			System.out.print("Common, used or imported (c/u/i): ");
			char result = scanner.next().charAt(0);
			System.out.print("Nome: ");
			String name = scanner.next();
			System.out.print("Preço:");
			double price = scanner.nextDouble();
			
			if(result == 'c') {
				list.add(new Product(name, price));
			}
			if(result == 'u') {
				System.out.print("Informe a data de fabricação (DD/MM/YYY): ");
				LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
				list.add(new UsedProduct(name, price, date));
			}
			if(result == 'i') {
				System.out.print("Taxa:");
				double taxa = scanner.nextDouble();
				list.add(new ImportedProduct(name, price , taxa));
			}
		}
		System.out.println("\nPreços Tags:\n");
		for (Product x : list) {
			System.out.println(x.priceTag());;
		}
		scanner.close();
	}
}
