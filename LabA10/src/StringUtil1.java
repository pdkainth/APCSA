/**
 * 
 * Last name: Prabhdeep
 * First name: Kainth
 * Student ID: 12089162 
 * Period: 4
 *
 */
/** A Sring utility class that operates on a string
 */
public class StringUtil1 
{	//Declare instance variables here	
	
	/**
	 * Method reverses a string
	 * @param str string to reverse
	 * @return reversed string
	 */
	public static String reverse(String str)
	{
		//Your code goes here
		if(str.length() == 1) {
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
	}
	
	
	
	/**
	 * Method determines if string is a palindrome
	 * @param str string to test
	 * @return true/false whether string is palindrome
	 */
	public static boolean palindrome(String str)
	{
		//Your code goes here
		String pal = palString(str).toLowerCase();
		String reverse = reverse(pal);
		
		return pal.equals(reverse);		
		
	}
	
	
	/**
	 * Method converts string into shorthand
	 * @param s string to be converted
	 * @return shorthand version of string
	 */
	public static String shorthand(String s)
	{
		//Your code goes here
		String postStr = change(s, "AND", "&");
		postStr = change(postStr, "TO", "2");
		postStr = change(postStr, "YOU", "u");
		postStr = change(postStr, "FOR", "4");
		postStr = change(postStr, "a", "");
		postStr = change(postStr, "e", "");
		postStr = change(postStr, "i", "");
		postStr = change(postStr, "o", "");
		postStr = change(postStr, "u", "");
		
		return postStr;
	}
	
	/**
	 * Method eliminates non alpha-numeric characters from string to create input
	 * @param str string to be evaluated
	 * @return cleaned string
	 */
	private static String palString(String str) {
		
		if (str.length() == 0) {
			return str;
		}
		
		String goodStr = str.substring(0, 1);  
		char testGood = str.charAt(0);
		
		if(!((('A' <= testGood) && (testGood <= 'Z')) ||
				(('a' <= testGood) && (testGood <= 'z')) ||
				(('0' <= testGood) && (testGood <= '9')))) {
			goodStr = "";
		}
		
		return goodStr + palString(str.substring(1));
	}
	
	/**
	 * Method changes keywords to shortened versions
	 * @param original original string
	 * @param look word to look
	 * @param change word to change
	 * @return changed string
	 */
	private static String change(String original, String look, String change) {
		
		String capsOrig = original.toUpperCase();
		
		String capsLook = look.toUpperCase();
		int index = capsOrig.indexOf(capsLook);

		if(index < 0) {
			return original;
		}

		String preString = original.substring(0, index);
		String postString = original.substring(index + look.length());
		
		return preString + change + change(postString, look, change);
	}
	
}