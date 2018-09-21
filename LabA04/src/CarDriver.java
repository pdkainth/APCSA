/**
 * 
 * @author Prabhdeep Kainth
 * period #4
 */
import java.util.Scanner;



public class CarDriver {
	public static void main(String[] args) {
		//your code goes here
		Scanner in = new Scanner(System.in);
		
		System.out.print("New car odometer reading: ");
		int startOdometer = in.nextInt();
		
		System.out.print("Filling Station Visit odometer reading: ");
		int finalOdometer = in.nextInt();
		
		System.out.print("gallins to fill tank: ");
		double gallons = in.nextDouble();
		
		Car car1 = new Car(startOdometer);
		car1.fillUp(finalOdometer, gallons);
		System.out.println("\nMiles per gallon: " + car1.calculateMPG());
		
		car1.resetMPG();
		
		
	}

}