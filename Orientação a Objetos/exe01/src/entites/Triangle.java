package entites;

public class Triangle {
	private Double a;
	private Double b;
	private Double c;
	
	public Triangle() {}

	public Triangle(Double a, Double b, Double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double counter() {
		double p=(a+b+c)/2.0;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
}
