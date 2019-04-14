/**
 * 
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 *
 */
public class Rectangle implements Measurable{
	//Your code goes here
	
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	
	public double getPerimeter() {
		
		return 2 * (length + width);
	}
	
	public double getArea() {
		return length * width;
	}
	
	public String toString() {
		String output = "Rectangle:\n";
		output += "       length = " + length;
		output += "\n       width = " + width;
		output += "\n       perimeter = " + getPerimeter();
		output += "\n       area = " + getArea();
		
		return output;
	}
	
	
}