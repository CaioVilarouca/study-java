package model.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entites.Notes;
import model.entites.Peolpe;
import model.services.CalculationNotes;
import model.services.Result;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nome: ");
		Peolpe peolpe = new Peolpe(scanner.nextLine());
		Notes first=null, second=null;
		try {
			for(int i=0;i<2;i++) {
				if(i==0)
					System.out.println("\nNotas do primeiro Semestre");
				else 
					System.out.println("\nNotas do segundo Semestre");
				
				System.out.print("Primeira nota: ");
				double notes01=scanner.nextDouble();
				System.out.print("Segunda nota: ");
				double notes02=scanner.nextDouble();
				System.out.print("Terceira nota: ");
				double notes03=scanner.nextDouble();
				
				if(i==0)
					first = new Notes(notes01,notes02,notes03);
				else 
					second = new Notes(notes01,notes02,notes03);
			}
			CalculationNotes calculationNotes = new CalculationNotes(first,second);
			calculationNotes.sum();
			Result result = new Result(peolpe, calculationNotes);
			result.resultNotes();
		} catch (InputMismatchException e) {
			System.out.println("ERRO de input variável ");
		} catch (IllegalArgumentException e) {
			System.out.println("ERRO na entrada de notas!" + e.getLocalizedMessage());
		} finally {
			scanner.close();
		}
		
	}
}
