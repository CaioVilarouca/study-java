package model.entities;

public class Triangle {
	private Double A;
	private Double B;
	private Double C;
	
	public Triangle(Double a, Double b, Double c) {
		A = a;
		B = b;
		C = c;
	}

	public Double getA() {
		return A;
	}


	public void setA(Double a) {
		A = a;
	}


	public Double getB() {
		return B;
	}


	public void setB(Double b) {
		B = b;
	}


	public Double getC() {
		return C;
	}


	public void setC(Double c) {
		C = c;
	}
}
