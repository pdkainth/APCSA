/**
 *
 * @author Prabhdeep Kainth
 * Period #4
 */

/**
 * 
 * Driver of the CarRental driver
 * 
 *
 */
public class CarRentalDriver {
	/**
	 * Main method of the driver class 
	 * @param args arguments
	 *
	 */
	public static void main(String[] args) {
		//Your code goes here
		CarRental c = new CarRental("Chevrolet", "Suburban", "CPR 607");
		System.out.println(c);

		CarRental c1 = new CarRental("Honda", "Civic", "RJK 492");
		System.out.println(c1);
		
		CarRental c2 = new CarRental("Nissan", "Maxima", "SPT 309");
		System.out.println(c2);

		
	}

}