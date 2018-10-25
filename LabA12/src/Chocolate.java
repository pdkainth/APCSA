/**
 * 
 * @author Prabhdeep Kainth
 * Period  #4
 *
 */
public class Chocolate {
	
	
	
	/**
	 * Checks if we can make chocolate bars
	 * @param big - number of big bricks
	 * @param small - number of small bricks
	 * @param goal - length of chocolate bar
	 * @return - true if we have enough bricks to make a chocolate bar, false otherwise
	 */
	public boolean canMakeBricks(int small, int big, int goal)
	{
		//Your code goes here	
		boolean bricks = true;
		
		if(((5 * big) + small) < goal) {
			bricks = false;
		}
		
		if(((goal / 5) <= big) && ((goal % 5) > small)) {
			bricks = false;
		}
		return bricks;
	}
	
	
	/**
	 * Determines number of small bricks needed to make the chocolate bar
	 * @param big - number of big bricks
	 * @param small - number of small bricks
	 * @param goal - length of chocolate bar
	 * @return number of small bricks needed
	 */
	public int numberOfSmallBricksNeeded(int small, int big, int goal)
	{
		//Your code goes here
		int numSmall = -1;
		
		if(((5 * big) + small) >= goal) {
			numSmall = goal - 5 * big;
		} 
		
		if((goal / 5 < big) && (goal % 5 <= small)) {
			numSmall = goal - 5 * (goal / 5);
		}
		
		if(((goal / 5) <= big) && ((goal % 5) > small)) {
			numSmall= -1;
		}
		
		return numSmall;
	}

}




///**
// * Driver class for Chocolate factory
// */
//public class ChocolateDriver {
//
///**
// * 
// * main method for chocolate driver
// * @param args - some random 
// * 
// */
//	public static void main(String[] args) {
//		Chocolate c = new Chocolate();
//		int s = 4;
//		int b = 1;
//		int g = 9;
//		System.out.println(c.canMakeBricks(s, b, g));
//		System.out.println(c.numberOfSmallBricksNeeded(s, b, g));
//	}
//
//}