/**
 * 
 * Prabhdeep Kainth
 * period  4
 */
public class Coins {
	// declare a private instance variable called cents
	// your code goes here
	private int cents;

	/**
	 * constructor to initialize the instance variables
	 * @param money - amount for which the change is to
	 * 			be computed
	 */
	public Coins(int money)
	{
		//initialize cents
		// your code goes here
		cents = money;
	}
	
	/**
	 * method to calculate the change
	 * @param money the amount for which the change is 
	 * 			to be computed
	 */
	public void change()
	{
		// your code goes here
		// print out initial amount of cents
		System.out.println(cents + " cents =>" );

		//calculate the amount of quarters that can go into cents
		int quarters = cents / 25;

		//calculate the amount of cents that still need change
		cents %= 25;
		System.out.println("Quarter(s) " + quarters );
		
		//calculate dimes
		int dimes = cents / 10;
		
		//calculate remaining cents
		cents %= 10;
		System.out.println("Dime(s) " + dimes );
		
		//calculate nickels
		int nickels = cents / 5;
		
		//remaining cents
		cents %= 5;
		System.out.println("Nickel(s) " + nickels );
		
		//print pennies(remaining cents)
		int pennies = cents;
		System.out.println("Penny(s) " + pennies );
		
		
	}

}