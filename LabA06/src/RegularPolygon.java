/**
 * class RegularPolygon - class to model any regular polygon
 * @author Prabhdeep Kainth
 * Period #4
 * 
 */

public class RegularPolygon {
	
	//Your code goes here
	private int myNumSides;
	private double mySideLength;
	private double myR;
	private double myr;
	
	/**
	 * Default Constructor
	 * Sets sides to 3 and length to 0
	 */
	public RegularPolygon() {
		myNumSides = 3;
		mySideLength = 0;
		
		calcr();
		calcR();
	}
	
	
	/**
	 * 
	 * @param sides - number of sides
	 * @param length - length of each side
	 */
	public RegularPolygon(int sides, double length) {
		myNumSides = sides;
		mySideLength = length;
	
		calcr();
		calcR();

	}
	
	
	/**
	 * calculates the radius of the inscribed circle
	 */
	private void calcr() {
		myr = 0.5 * mySideLength * (1 / Math.tan(Math.PI / myNumSides));
	}
	
	
	/**
	 * calculates the radius of the circumscribed circle
	 */
	private void calcR() {
		myR = 0.5 * mySideLength * (1 / Math.sin(Math.PI / myNumSides));
	}
	
	
	/**
	 * calculates the vertex angle
	 * @return vertex angle of polygon
	 */
	public double vertexAngle() {
		double sides = myNumSides;
		double vertexAngle = ((sides - 2) / sides) * 180;
		return vertexAngle;
	}
	
	
	/**
	 * calculates the perimeter of the polygon
	 * @return - perimeter
	 */
	public double Perimeter() {
		double perimeter = mySideLength * myNumSides;
		return perimeter;
	}
	
	
	/**
	 * calculates the area of the polygon
	 * @return - area of the polygon
	 */
	public double Area() {
		double area = 0.5 * myNumSides * Math.pow(myR, 2) * Math.sin(2 * Math.PI / myNumSides);
		return area;
	}
	
	
	/**
	 * 
	 * @return - number of sides of polygon
	 */
	public int getNumside() {
		return myNumSides;
	}
	
	
	/**
	 * 
	 * @return - side length of the polygon
	 */
	public double getSideLength() {
		return mySideLength;
	}
	
	
	/**
	 * 
	 * @return - radius of the inscribed circle
	 */
	public double getR() {
		return myR;
	}
	
	
	/**
	 * 
	 * @return - the radius of the circumscribed circle
	 */
	public double getr() {
		return myr;
	}
	
	
}