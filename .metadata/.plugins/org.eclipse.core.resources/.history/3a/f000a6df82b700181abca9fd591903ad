/**
 * 
 * @author Prabhdeep Kainth
 * period #4
 */
public class Car {
	//your code goes here
	private int startOdometer;
	private int currentOdometer;
	private double gallonsConsumed;
	
	public Car(int odometer) {
		startOdometer = odometer;
	}
	
	public void fillUp(int current, double consumed) {
		currentOdometer = current;
		gallonsConsumed = consumed;
	}
	
	public void resetMPG() {
		gallonsConsumed = 0;
		startOdometer = currentOdometer;
	}
	
	public double calculateMPG() {
		double mpg = (currentOdometer - startOdometer) / gallonsConsumed;
		return mpg;
	}
}//end class