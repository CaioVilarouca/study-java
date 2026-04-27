package services;

public class SumSalary {
	public double sum(double tax, double salary) {
		return salary+((tax*salary)/100.0);
	}
}
