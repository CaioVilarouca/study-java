package model.services;

import model.entites.Peolpe;

public class Result {
	Peolpe peolpe;
	CalculationNotes calculationNotes;
	
	public Result(Peolpe peolpe, CalculationNotes calculationNotes) {
		super();
		this.peolpe = peolpe;
		this.calculationNotes = calculationNotes;
	}

	public void resultNotes() {
		System.out.println("Aluno: "+ peolpe.getName());
		if (calculationNotes.getResult01() > 60)
			System.out.println("Primeiro Semestre APROVADO, " + calculationNotes.getResult01());
		else
			System.out.println("Primeiro Semestre REPROVADO, " + calculationNotes.getResult01());
		if (calculationNotes.getResult02() > 60)
			System.out.println("Segundo Semestre APROVADO, " + calculationNotes.getResult02());
		else
			System.out.println("Primeiro Semestre REPROVADO, " + calculationNotes.getResult02());
	}
}
