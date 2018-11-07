/**
 * 
 * @author Prabhdeep Kainth
 * Period 4
 *
 */
public class KochCurveDriver{
	
	/**
	 * Main method to run the KochCurve program
	 * @param args
	 */
	public static void main(String[] args) {
		
		KochCurve curve1 = new KochCurve (500,500,0,0);
		curve1.drawKochCurve(6, 300);
		KochCurve curve2 = new KochCurve(500,500,500,0);
		curve2.drawSnowflake(5, 250);
		KochCurve curve3 = new KochCurve (500,500,0,500);
		curve3.drawSnowflake(7, 250);
		
	}
	
	
}