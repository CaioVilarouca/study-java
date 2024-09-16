package entities;

public class LibraryMath {
	public double caractere01;
	public double caractere02;
	public double caractere03;
	public double caractere04;

	
	public LibraryMath(double caractere01, double caractere02) {
		super();
		this.caractere01 = caractere01;
		this.caractere02 = caractere02;
	}
	
	public LibraryMath(double caractere01) {
		super();
		this.caractere01 = caractere01;
	}
	
	public LibraryMath(double caractere01, double caractere02, double caractere03, double caractere04) {
		super();
		this.caractere01 = caractere01;
		this.caractere02 = caractere02;
		this.caractere03 = caractere03;
		this.caractere04 = caractere04;
	}

	// Calculando o raio de um circulo
	public double mathRay () {
		double pi = 3.14159;
		return  pi * caractere01 * caractere01;
	}
	
	// Soma de dois números
	public double mathSum () {
		return  caractere01 + caractere02;
	}
	
	// Soma de quatro valores
	public double MathFour() {
		return (caractere01 * caractere02) - (caractere03 * caractere04);
	}
}
