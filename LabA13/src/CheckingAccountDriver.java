/**
 * 
 * @author Prabhdeep Kainth
 * Period # 4
 */
public class CheckingAccountDriver {
	
	/**
	 * Main method to run
	 * @param args - arguments
	 */
	public static void main(String[] args)
	{
		// Your code goes here
		
		try {
			CheckingAccount acc1 = new CheckingAccount(-345, 100);
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
			
			try {
				CheckingAccount acc2 = new CheckingAccount(345, 102);
				acc2.deposit(-33);
			} catch (ArithmeticException e2) {
				System.out.println(e2.getMessage());
				
				try {
					CheckingAccount acc3 = new CheckingAccount(322, 103);
					acc3.withdraw(345);
				} catch (ArithmeticException e3) {
					System.out.println(e3.getMessage());
				}
			}
		}
	}
}