package model.service;

import model.entities.Triangle;

public class Validation {
	public double verification(Triangle triangle) {
		double p=(triangle.getA()+triangle.getB()+triangle.getC())/2.0;
		return Math.sqrt(p*(p-triangle.getA())*(p-triangle.getB())*(p-triangle.getC()));
	}
	
	public void area(double triangleX,double triangleY) {
		if (triangleX>triangleY)
			System.out.println("Maior X");
		else 
			System.out.println("Maior Y");
	}
}
