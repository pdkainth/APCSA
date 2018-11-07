/**
 *   
 * @author Prabhdeep Kainth
 * Period #4
 */
/** Write a one sentence summary about your class
 * The Fibonacci class takes a number position and returns the cooresponding fibonacci sequence
 */
public class Fibonacci {
	/**
	 * Write a one sentence description of the method
	 * This method takes in the position and returns the cooresponding fibonacci number
	 * Describe the parameters and return values
	 * @param n - the position of the number
	 * @return fibonacci number
	 */

	public int fib(int n)
	{
		//Your code goes here
		if(n == 0) {
			return n;
		}
		
		if(n == 1) {
			return n;
		}
		
		return fib(n - 1) + fib(n - 2);
	}//end method

}//end class