/**
 * 
 * @author Your name
 * Period #
 *
 */
public class NotChecker implements Checker
{
	//Declare instance variables here
	Checker myChecker;
	/**
	 * Constructor
	 * @param check - Checker object
	 */
	public NotChecker(Checker check)
	{
		//Your code goes here
		myChecker = check;

	}// end constructor
	/**
	 * Method to check if the the Checker object 
	 * does not contain the given string
	 * @param str - string to check
	 * @return - true if the Checker object does not
	 * 			 contain the give string, false otherwise
	 */
	public boolean accept(String str)
	{
		//Your code goes here
		return !(myChecker.accept(str));

	}

}// end class NotChecker