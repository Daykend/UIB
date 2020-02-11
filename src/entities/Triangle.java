package entities;

public class Triangle {
	private double a;
	private double b;
	private double c;
	
	public double calcPerimeter() {
		return (a + b + c) / 2.0;
	}
	
	public double calcArea() {
		double p = calcPerimeter();
		
		return Math.sqrt(p * (p-a)*(p-b)*(p-c));
	}
	
}
