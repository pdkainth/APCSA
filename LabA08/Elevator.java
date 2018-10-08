import java.util.Scanner;
/**
 * 
 * @author Prabhdeep Kainth
 * period #4
 * 
 * Elevator class returns a message based on the floor that the user wants to go to
 */

public class Elevator {
	//Your code goes here
	Scanner in = new Scanner(System.in);
	public static final int MAX_FLOORS = 20;
	
	/**
	 * Simulates going up an elevator based on the floor input
	 */
	public void simulate() {
		System.out.print("Floor: ");
		
		if(in.hasNextInt()) {
			int floor = in.nextInt();
			//test for 13 and outside 1 and 20
			if(floor > 0 && floor <= MAX_FLOORS && floor != 13) {
				if(floor > 13) {
					System.out.println("Thank you, I will take you to the actual floor " + (floor - 1));
				} else {
					System.out.println("Thank you, I will take you to the actual floor " + floor);
				}
			} else {
				System.out.println("Error: The floor must be between 1 and 20");
			}
		} else {
			System.out.println("Error: Not an integer");
		}
	}
	
}