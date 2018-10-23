/**
 * 
 * @author Prabhdeep Kainth
 * Period # 4
 *
 */
public class GCFAndLCM {
	
	
	/**
	 * Method to find the greatest common divisor
	 * of the given numbers
	 * @param a - first number
	 * @param b - second number
	 * @return - the greatest common divisor
	 */
	public static int GCF(int a, int b) 
	{
		//Your code goes here
		while(a != b) {
			if(b > a) {
				b = b - a;
			} else {
				a = a - b;
			}
		}
		
		return a;

	}
	
	
	/**
	 * Method to find the least common multiple of the 
	 * given numbers
	 * @param a - first number
	 * @param b - second number
	 * @return - the least common multiple
	 */
	public static int LCM(int a, int b)
	{
		//Your code goes here
		int lcm = a * b / GCF(a,b);
		
		return lcm;
		
		
	}

}