package application;

import model.entites.Value;
import model.services.Calculation;

public class Program {
	public static void main(String[] args) {
		new Program().system();
	}
	
	public void system() {
		Value value01 = new Value(10, 30);
		Calculation calculation = new Calculation(value01);
		System.out.println("A SOMA = "+ calculation.sum());

		Value value02 = new Value(-30, 10);
		Calculation calculation2 = new Calculation(value02);
		System.out.println("A SOMA = "+ calculation2.sum());
		
		Value value03 = new Value(0, 0);
		Calculation calculation3 = new Calculation(value03);
		System.out.println("A SOMA = "+ calculation3.sum());
	}
}
