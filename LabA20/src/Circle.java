/**
 * 
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 *
 */
public class Circle implements Measurable{
	//Your Code goes here
	private double radius;
	
	public Circle(double r) {
		radius = r;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public String toString() {
		String output = "Circle:\n";
		output += "       radius = " + radius;
		output += "\n       circumference = " + getPerimeter();
		output += "\n       area = " + getArea();
		
		return output;
	}
}