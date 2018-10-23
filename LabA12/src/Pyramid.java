/**
 * @author Prabhdeep Kainth
 * Period #4
 * 
 */
public class Pyramid {
	/**
	 * Method to make a pyramid
	 * @param n - height of the pyramid
	 */
	public static void pyramid(int n)
	{
		//Your code goes here
		int totalAstericks = 1 + 2 * (n - 1);
		int rowCount = 1;
		int spaces = 0;
		int astericks= 0;
		
		while(rowCount <= n) {
			astericks = 1 + 2 * (rowCount - 1);
			spaces = (totalAstericks - astericks) / 2;
			for(int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= astericks; k++) {
				System.out.print("*");
			}

			for(int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}

			System.out.println();
			rowCount++;

		}
		

	}
	
/*	public static void main(String args[]) {
		pyramid(5);
	}
*/
}