/**
 * 
 * @author Prabhdeep Kainth
 * period 4
 *
 * Point class provides a model for a 2-d point
 */

public class Point {
	
	private double x;
	private double y;
	
	/**
	 * Default constructor sets point to origin
	 */
	public Point() {
		x = 0.0;
		y = 0.0;
	}
	
	/**
	 * Parameter constructor
	 * @param x - x coordinate of point
	 * @param y - y coordinate of point
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Parameter constructor sets the x and y coordinates to those of another object
	 * @param p - another point object
	 */
	public Point(Point p) {
		this.x = p.getX();
		this.y = p.getY();
	}
	
	/**
	 * Returns the x coordinate of this point
	 * @return - x coordinate of point
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * Returns the y coordinate of this point
	 * @return - y coordinate of point
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * Sets the x coordinate of this point
	 * @param x - x coordinate of point
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * Sets the y coordinate of this point
	 * @param y - y coordinate of point
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * Sets the x and y coordinate of this point
	 * @param x - x coordinate of point
	 * @param y - y coordinate of point
	 */
	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Sets x and y coordinate to those of another Point object
	 * @param p - another point object
	 */
	public void setPoint(Point p) {
		this.x = p.getX();
		this.y = p.getY();
	}
	
	/**
	 * Determines the quadrant 0 (origin), 1, 2, 3
	 * @return - quadrant the point is in
	 */
	public int quadrant() {
		int quadrant = 0;
		
		if(x > 0) {
			if(y > 0) {
				quadrant  = 1;
			}
			
			if(y < 0) {
				quadrant = 4;
			}
		}
		
		if(x < 0) {
			if(y > 0) {
				quadrant = 2;
			}
			
			if(y < 0) {
				quadrant = 3;
			}
		}
		
		if(x == 0 && y == 0) {
			quadrant = 0;
		}
		
		return quadrant;
	}
	
	/**
	 * 
	 * @param other - Point object
	 * @return - distance between Point and other
	 */
	public double distance(Point other) {
		double distance = Math.sqrt(Math.pow(this.getX() - other.getX(), 2) + Math.pow(this.getY() - other.getY(), 2));
		
		return distance;
	}
	
	/**
	 * 
	 * @param otherX - x coordinate of other point
	 * @param otherY - y coordinate of othet point
	 * @return - distance between Point and another set of coordinates
	 */
	public double distance(double otherX, double otherY) {
		double distance = Math.sqrt(Math.pow(this.getX() - otherX, 2) + Math.pow(this.getY() - otherY, 2));
		
		return distance;

	}
	
	/**
	 * Determines if this point is equal to another
	 * @param p - Point object
	 * @return - true if coordinates of Point match p and false otherwise
	 */
	public boolean equals(Point p) {
		boolean equals = false;
		
		if((this.getX() == p.getX()) && (this.getY() == p.getY())) {
			equals = true;
		}
		
		return equals;
	}
	
	/**
	 * Compares the distance between this point and returns the point that is 
	 * farthest away
	 * @param p1 - first Point object
	 * @param p2 - second Point object
	 * @return - Point object that is farther, null if they are equidistant
	 * 
	 */
	public Point whichIsFarther(Point p1, Point p2) {
		Point p3 = null;
		
		double distance1 = this.distance(p1);
		double distance2 = this.distance(p2);
		
		if(distance1 > distance2) {
			p3 = p1;
			
		} else if(distance1 < distance2){
			p3 = p2;
			
		}
		
		return p3;
	}
	
	/**
	 * Creates a formatted String of the object
	 * @return point as a formatted string
	 */
	public String toString() {
		String toString = String.format("(" + "%.2f" + ", " + "%.2f" + ")", x, y);
		return toString;
		
	}
	
	
}

