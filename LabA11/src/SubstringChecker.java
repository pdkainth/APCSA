/**
 * 
 * @author Prabhdeep Kainth
 * Period #4
 *
 */
public class SubstringChecker implements Checker
{
	//Declare instance variables here
	String myStr;
	/**
	 * Constructor
	 * @param str - String to check
	 */
	public SubstringChecker(String str)
	{
		//Your code goes here
		myStr = str;
		
	}// end constructor
	
	
	/**
	 * Method to check if the given string is acceptable
	 * @param str - String to check
	 * @return - true if the given string contains myStr,
	 * 			 false otherwise
	 */
	public boolean accept(String str)
	{
		//Your code goes here
		if(str.contains(myStr)) {
			return true;
		} else {
			return false;
		}

	}// end accept

}