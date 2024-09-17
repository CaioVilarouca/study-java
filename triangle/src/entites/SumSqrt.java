package entites;

public class SumSqrt {
		public Triangle triangle;
		
		public double area (Triangle triangle) {
			double p = (triangle.sideA + triangle.sideB + triangle.sideC) / 2.0f;
			double area =  Math.sqrt(p * (p - triangle.sideA) * (p - triangle.sideB) * (p - triangle.sideC));
			return area;
		}
		
}
