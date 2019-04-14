/**
 * 
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 *
 */
public class Triangle implements Measurable{
	//Your code goes here
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getPerimeter() {
		return a + b + c;
	}
	
	public double getArea() {
		double p = getPerimeter() / 2;
		
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public String toString() {
		String output = "Triangle:\n";
		output += "       side1 = " + a;
		output += "\n       side2 = " + b;
		output += "\n       side3 = " + c;
		output += "\n       perimeter = " + getPerimeter();
		output += "\n       area = " + getArea();
		
		return output;
	}
}