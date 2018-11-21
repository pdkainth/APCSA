import java.util.Scanner;

/**
 * 
 * @author Prabhdeep Kainth
 * Period 4
 * 
 * Class adds astericks, commas, and rounds checking amount
 *
 */
public class CheckProtection {
	
	private String amount;
	private final int MAX_LENGTH;
	
	/**
	 * Constructor prompts For the amount, rounds the amount to two
	 * decimal places checks if the amount entered has a length less than
	 * MAX_LENGTH If the amount exceeds the MAX_LENGTH, prints an error message
	 * If the amount is within range prints the check amount with commas and
	 * spaces filled with *
	 * @param max max characters to print out
	 */
	public CheckProtection(int max) 
	{
		//Your code goes here
		System.out.print("Enter the check amount: ");
		Scanner in = new Scanner(System.in);
		MAX_LENGTH = max;
		amount = in.nextLine();
		
		amount = round(amount);
		amount = addCommas(amount);
		amount = addAsterisks(amount);
		
		if(amount.length() > MAX_LENGTH) {
			System.out.println("Error: number is too big");
		} else {
			printAmount();
		}
	}

	/**
	 * Adds commas to the number recursively
	 * 
	 * @param s - number as a string
	 * @return - number with commas inserted
	 */
	public String addCommas(String s) 
	{
		String nonDecimals = "";
		int dec = s.indexOf(".");
		String decimals = "";
		
		if( dec >= 0) {
			nonDecimals = s.substring(0, dec);
			decimals = s.substring(dec);
		} else {
			nonDecimals = s;
		}
		
		int length = nonDecimals.length();
		if(length <= 3) {
			return nonDecimals + decimals;
		} else {
			return addCommas(nonDecimals.substring(0, length - 3)) + "," + nonDecimals.substring(length - 3) + decimals;
		}
		
		
	}

	/**
	 * Adds the stars to fill in leading spaces recursively
	 * 
	 * @param s - number as a string
	 * @return - number with leading stars
	 */
	public String addAsterisks(String s) 
	{
		if(s.length() >= MAX_LENGTH) {
			return s;
		} else {
			s = "*" + s;
		}
		
		return addAsterisks(s);
		
	}

	/**
	 * Prints the amount with leading stars and commas in the between
	 */
	public void printAmount() 
	{
		System.out.println("amount = $" + amount);
	}
	
	/**
	 * Rounds string to two decimal place string
	 * @param original original string
	 * @return rounded string
	 */
	private String round(String original) {
		String afterRound = floatTostring(stringTofloat(original));
		int addAZero = afterRound.length() - afterRound.indexOf(".");
		
		if(addAZero == 2) {
			return afterRound + "0";
		} else {
			return afterRound;
		}
		 
	}
	
	/**
	 * Converts string to a float with iteration
	 * @param s string
	 * @param power10 power of 10 to scale digit
	 * @return floating point number
	 */
	private double stringTofloatHelper(String s, double power10) {
		//System.out.println(s + " " + power10);
		if(s.length() == 0) {
			return 0.0;
		}
		
		if(s.charAt(0) == '.') {
			return stringTofloatHelper(s.substring(1), power10);
		}
		
		return (charToint(s.charAt(0)) * power10) + stringTofloatHelper(s.substring(1), power10 / 10);
		
	}
	
	/**
	 * Converts string to float with rounding
	 * @param s string to convert
	 * @return converted floating point number
	 */
	private double stringTofloat(String s) {
		int firstPow = s.indexOf(".");
		if(firstPow == -1) {
			firstPow = s.length();
		}
		
		double first = Math.pow(10, firstPow - 1);
		double preRound =  stringTofloatHelper(s, first);
		
		return (Math.round(preRound * 100.0)) / 100.0;
	}
	
	/**
	 * Converts character to integer
	 * @param pre character to convert
	 * @return converted integer
	 */
	private int charToint(char pre) {
		return (int)(pre) - '0';
	}
	
	/**
	 * Converts float to string
	 * @param x float to convert
	 * @return converted string
	 */
	private String floatTostring(double x) {
		return "" + x;
	}
	
}
