/**
 * 
 * @author Prabhdeep Kainth
 * Period #4
 *
 */
public class FunLoops {
	
	/**
	 * Method to find the first n magic squares
	 * @param n - number of magic squares to find
	 */
	public static void magicSquares(int n)
	{
		
		System.out.print("The first " + n + " magic squares are:");
		//Your code goes here
		int count = 1;
		int subtotal = 1;
		int total = 0;
		
		while(count <= n) {
			total += subtotal;
			
			if(Math.floor(Math.sqrt(total)) == Math.sqrt(total)) {
				System.out.print(total + " ");
				count ++;
			}
			
			subtotal++;
		}
		
	}
	
}