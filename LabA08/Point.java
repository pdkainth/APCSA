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
	 * Default constructor sets point to (0,0)
	 */
	public Point() {
		x = 0;
		y = 0;
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
	 * 
	 * @return - x coordinate of point
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * 
	 * @return - y coordinate of point
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * 
	 * @param x - x coordinate of point
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * 
	 * @param y - y coordinate of point
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * 
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
	 * 
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
	 * @param otherX - x coordinate
	 * @param otherY - y coordinate
	 * @return - distance between Point and another set of coordinates
	 */
	public double distance(double otherX, double otherY) {
		double distance = Math.sqrt(Math.pow(this.getX() - otherX, 2) + Math.pow(this.getY() - otherY, 2));
		
		return distance;

	}
	
	/**
	 * 
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
	 * 
	 * @param p1 - first Point object
	 * @param p2 - second Point object
	 * @return - Point object that is closer
	 */
	public Point whichIsFarther(Point p1, Point p2) {
		Point p3;
		
		double distance1 = this.distance(p1);
		double distance2 = this.distance(p2);
		
		if(distance1 > distance2) {
			p3 = p1;
		} else {
			p3 = p2;
		}
		
		return p3;
	}
	
	
}

