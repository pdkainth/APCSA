/**
 * 
 * Last name: Prabhdeep
 * First name: Kainth
 * Student ID: 12089162 
 * Period: 4
 *
 */
/** Write a one sentence summary about your class
 */
public class StringUtil1 
{	//Declare instance variables here
	private static int palCount = 0;
	private static String palStr = "";
	
	
	/**
	 * Write a one sentence description of the method
	 * Describe the parameters and return values
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
	 * Write a one sentence description of the method
	 * Describe the parameters and return values
	 */
	
	public static boolean palindrome(String str)
	{
		//Your code goes here
		String pal = palString(str).toLowerCase();
		String reverse = reverse(pal);
		
		return pal.equals(reverse);		
		
	}
	
	
	/**
	 * Write one sentence description of the method
	 * Describe the parameters and return values
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
	
	//make private after testing
	private static String change(String original, String lookFor, String change) {
		
		String capsOrig = original.toUpperCase();
		String capsLook = lookFor.toUpperCase();
		int index = capsOrig.indexOf(capsLook);

		if(index < 0) {
			return original;
		}

		String preString = original.substring(0, index);
		String postString = original.substring(index + lookFor.length());
		
		return preString + change + change(postString, lookFor, change);
	}
	
	public static void main(String args[]) {
		//System.out.println(shorthand("Why you do dis?"));
		System.out.println(change("To YoU aND FOR you, AMy", "you", "u"));

	}
}