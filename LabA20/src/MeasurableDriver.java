import java.util.ArrayList;
/**
 * 
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 *
 */

public class MeasurableDriver {
	
	public static void main(String[] args) {
		//Your code goes here
		ArrayList <Measurable> a = new ArrayList <Measurable> ();
		
		a.add(new Circle(1.0));
		a.add(new Rectangle(1.0, 1.0));
		a.add(new Triangle(3.0, 4.0, 5.0));
		a.add(new SingingRectangle(2, 2));
		a.add(new Circle(1.5));
		a.add(new Rectangle(1.0, 1.5));
		a.add(new Triangle(7.0, 24.0, 25.0));
		a.add(new Circle(2.0));
		a.add(new Rectangle(2.0, 3.0));
		a.add(new Triangle(11.0, 60.0, 61.0));
		
		for(Measurable m : a) {
			System.out.println(m);
			System.out.println();
		}
	}

}