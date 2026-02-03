package model.services;

import model.entites.Notes;

public class CalculationNotes {	
	protected double result01;
	protected double result02;

	private Notes notes1,notes2;	
	public CalculationNotes(Notes notes1, Notes notes2) {
		this.notes1 = notes1;
		this.notes2 = notes2;
	}
	
	public double sum() {
		if (notes1.getNotes01() >30.0)
			throw new IllegalArgumentException("MAX 30, valor digitado: " + notes1.getNotes01());
		if (notes1.getNotes02() >30.0)
			throw new IllegalArgumentException("MAX 30, valor digitado: " + notes1.getNotes02());
		if (notes1.getNotes03() >30.0)
			throw new IllegalArgumentException("MAX 30, valor digitado: " + notes1.getNotes03());
		if (notes2.getNotes01() >35.0)
			throw new IllegalArgumentException("MAX 35, valor digitado: " + notes2.getNotes01());
		if (notes2.getNotes02() >35.0)
			throw new IllegalArgumentException("MAX 35, valor digitado: " + notes2.getNotes02());
		if (notes2.getNotes03() >35.0)
			throw new IllegalArgumentException("MAX 35, valor digitado: " + notes2.getNotes03());
		
		 this.result01 = notes1.getNotes01()+notes1.getNotes02()+notes1.getNotes03();
		 this.result02 = notes2.getNotes01()+notes2.getNotes02()+notes2.getNotes03();

		return 0;
	}

	public double getResult01() {
		return result01;
	}

	public void setResult01(double result01) {
		this.result01 = result01;
	}

	public double getResult02() {
		return result02;
	}

	public void setResult02(double result02) {
		this.result02 = result02;
	}
	
	
}
